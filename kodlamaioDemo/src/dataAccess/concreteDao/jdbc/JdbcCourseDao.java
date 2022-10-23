package dataAccess.concreteDao.jdbc;

import dataAccess.abstractsDao.CourseDao;
import entities.Course;

public class JdbcCourseDao implements CourseDao {
    @Override
    public void add(Course course) {
        System.out.println(course.getCourseName() + " course added to database using JDBC");
    }
}
