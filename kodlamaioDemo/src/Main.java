import business.concrete.CategoryManager;
import business.concrete.CourseManager;
import business.concrete.TeacherManager;
import core.logging.DatabaseLogger;
import core.logging.FileLogger;
import core.logging.Logger;
import dataAccess.concreteDao.hibernate.HibernateCategoryDao;
import dataAccess.concreteDao.hibernate.HibernateTeacherDao;
import dataAccess.concreteDao.jdbc.JdbcCourseDao;
import dataAccess.concreteDao.jdbc.JdbcTeacherDao;
import entities.Category;
import entities.Course;
import entities.Teacher;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        List<Logger> loggers = new ArrayList<Logger>();
        loggers.add(new DatabaseLogger());
        loggers.add(new FileLogger());

        Teacher teacher = new Teacher();
        teacher.setId(1);
        teacher.setFirstName("Omer");
        teacher.setLastName("Faruk");
        teacher.setBranch("Math");

        TeacherManager teacherManager = new TeacherManager(new HibernateTeacherDao(), loggers);
        teacherManager.add(teacher);

        TeacherManager teacherManager1 = new TeacherManager(new JdbcTeacherDao(), loggers);
        teacherManager1.add(teacher);

        List<Course> courses = new ArrayList<>();

        Course course = new Course();
        course.setId(1);
        course.setCourseName("Java");
        course.setCoursePrice(10); // If the course price is less than 0, an error is output to the console without any additions.
        course.setDescription("oop programming");

        Course course1 = new Course();
        course1.setCourseName("Java");

        CourseManager courseManager = new CourseManager(new JdbcCourseDao(), courses, loggers);
        courseManager.add(course);
        // CourseManager.add(course1); // gives an error

        List<Category> categories = new ArrayList<>();

        Category category = new Category();
        category.setId(1);
        category.setCategoryName("oop");

        Category category1 = new Category();
        category1.setCategoryName("oop");

        CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao(), categories, loggers);
        categoryManager.add(category);
        // categoryManager.add(category1); // gives an error
    }
}