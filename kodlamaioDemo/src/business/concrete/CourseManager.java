package business.concrete;

import business.abstracts.CourseService;
import core.logging.Logger;
import dataAccess.abstractsDao.CourseDao;
import entities.Course;

import java.util.List;

public class CourseManager implements CourseService {
    private final CourseDao courseDao;
    private final List<Course> courses;
    private final List<Logger> loggers;

    public CourseManager(CourseDao courseDao, List<Course> courses, List<Logger> loggers) {
        this.courseDao = courseDao;
        this.courses = courses;
        this.loggers = loggers;
    }

    @Override
    public void add(Course course) throws Exception {
        if (course.getCoursePrice() < 0) {
            System.out.println("The course fee cannot be less than 0");
            return;
        }
        for (Course c : courses) {
            if (course.getCourseName().equals(c.getCourseName())) {
                throw new Exception("More than one course with the same name cannot be added.");
            }
        }
        courseDao.add(course);
        courses.add(course);

        for (Logger logger : loggers) {
            logger.log(course.getCourseName());
        }
    }
}
