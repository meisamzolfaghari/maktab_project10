package ir.maktab.hibernate.projects.article.features.articlemanagement.usecases;

import ir.maktab.hibernate.projects.article.model.Article;
import ir.maktab.hibernate.projects.article.features.articlemanagement.ArticleUseCase;

import java.util.List;

public interface FindAllPublishedArticleUseCase extends ArticleUseCase {
    List<Article> list();
}
