package dataAccess.concreteDao.jdbc;

import dataAccess.abstractsDao.TeacherDao;
import entities.Teacher;

public class JdbcTeacherDao implements TeacherDao {
    @Override
    public void add(Teacher teacher) {
        System.out.println(teacher.getFirstName() + " " + teacher.getLastName() + " teacher added to database using JDBC");
    }
}
