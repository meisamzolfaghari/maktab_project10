package ir.maktab.hibernate.projects.article.features.articlemanagement.usecases;

import ir.maktab.hibernate.projects.article.model.Article;
import ir.maktab.hibernate.projects.article.model.Category;
import ir.maktab.hibernate.projects.article.model.Tag;
import ir.maktab.hibernate.projects.article.model.User;
import ir.maktab.hibernate.projects.article.features.articlemanagement.ArticleUseCase;

import java.util.Date;
import java.util.List;

public interface AddArticleUseCase extends ArticleUseCase {
    Article add(String title, String brief, String Content, Date currentDate, User user, Category category, List<Tag> tags);
}
