package business.concrete;

import business.abstracts.TeacherService;
import core.logging.Logger;
import dataAccess.abstractsDao.TeacherDao;
import entities.Teacher;

import java.util.List;

public class TeacherManager implements TeacherService {
    private final TeacherDao teacherDao;
    private final List<Logger> loggers;

    public TeacherManager(TeacherDao teacherDao, List<Logger> loggers) {
        this.teacherDao = teacherDao;
        this.loggers = loggers;
    }

    @Override
    public void add(Teacher teacher) {
        teacherDao.add(teacher);

        for (Logger logger : loggers) {
            logger.log(teacher.getFirstName() + " " + teacher.getLastName());
        }
    }
}
