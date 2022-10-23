package dataAccess.concreteDao.hibernate;

import dataAccess.abstractsDao.CourseDao;
import entities.Course;

public class HibernateCourseDao implements CourseDao {
    @Override
    public void add(Course course) {
        System.out.println(course.getCourseName() + " course added to database base using Hibernate");
    }
}
