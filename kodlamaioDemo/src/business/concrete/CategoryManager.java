package business.concrete;

import business.abstracts.CategoryService;
import core.logging.Logger;
import dataAccess.abstractsDao.CategoryDao;
import entities.Category;

import java.util.List;

public class CategoryManager implements CategoryService {
    private final CategoryDao categoryDao;
    private final List<Category> categories;
    private final List<Logger> loggers;

    public CategoryManager(CategoryDao categoryDao, List<Category> categories, List<Logger> loggers) {
        this.categoryDao = categoryDao;
        this.categories = categories;
        this.loggers = loggers;
    }

    @Override
    public void add(Category category) throws Exception {
        for (Category c : categories) {
            if (category.getCategoryName().equals(c.getCategoryName())) {
                throw new Exception("More than one category with the same name cannot be added.");
            }
        }
        categoryDao.add(category);
        categories.add(category);

        for (Logger logger : loggers) {
            logger.log(category.getCategoryName());
        }
    }
}
