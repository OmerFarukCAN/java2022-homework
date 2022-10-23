package dataAccess.concreteDao.hibernate;

import dataAccess.abstractsDao.TeacherDao;
import entities.Teacher;

public class HibernateTeacherDao implements TeacherDao {
    @Override
    public void add(Teacher teacher) {
        System.out.println(teacher.getFirstName() + " " + teacher.getLastName() + " teacher added to database base using Hibernate");
    }
}
