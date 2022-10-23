package dataAccess.concreteDao.jdbc;

import dataAccess.abstractsDao.CategoryDao;
import entities.Category;

public class JdbcCategoryDao implements CategoryDao {
    @Override
    public void add(Category category) {
        System.out.println(category.getCategoryName() + " added to database using JDBC");
    }
}
