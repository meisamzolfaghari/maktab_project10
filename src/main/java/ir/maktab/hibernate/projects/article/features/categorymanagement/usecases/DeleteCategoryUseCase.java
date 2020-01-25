package ir.maktab.hibernate.projects.article.features.categorymanagement.usecases;

import ir.maktab.hibernate.projects.article.model.Category;
import ir.maktab.hibernate.projects.article.features.categorymanagement.CategoryUseCase;

public interface DeleteCategoryUseCase extends CategoryUseCase {
    Boolean delete(Category category);
}
