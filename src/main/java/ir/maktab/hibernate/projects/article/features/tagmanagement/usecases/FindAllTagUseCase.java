package ir.maktab.hibernate.projects.article.features.tagmanagement.usecases;

import ir.maktab.hibernate.projects.article.model.Tag;
import ir.maktab.hibernate.projects.article.features.tagmanagement.TagUseCase;

import java.util.List;

public interface FindAllTagUseCase extends TagUseCase {
    List<Tag> list();
}
