package dataAccess.concreteDao.hibernate;

import dataAccess.abstractsDao.CategoryDao;
import entities.Category;

public class HibernateCategoryDao implements CategoryDao {
    @Override
    public void add(Category category) {
        System.out.println(category.getCategoryName() + " category added to database base using Hibernate");
    }
}
