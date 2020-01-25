package ir.maktab.hibernate.projects.article.features.articlemanagement.usecases;

import ir.maktab.hibernate.projects.article.model.Article;
import ir.maktab.hibernate.projects.article.features.articlemanagement.ArticleUseCase;

public interface DeleteArticleUseCase extends ArticleUseCase {
    Boolean delete(Article articleForDelete);
}
