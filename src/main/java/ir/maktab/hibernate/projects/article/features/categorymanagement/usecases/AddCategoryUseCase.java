package ir.maktab.hibernate.projects.article.features.categorymanagement.usecases;

import ir.maktab.hibernate.projects.article.model.Category;
import ir.maktab.hibernate.projects.article.features.categorymanagement.CategoryUseCase;

public interface AddCategoryUseCase extends CategoryUseCase {
    Category add(String title, String description);
}
