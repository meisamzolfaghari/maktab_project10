package ir.maktab.hibernate.projects.article.features.usermanagement.usecases;

import ir.maktab.hibernate.projects.article.model.User;
import ir.maktab.hibernate.projects.article.features.usermanagement.UserUseCase;

import java.util.Date;

public interface ChangeBirthdayUseCase extends UserUseCase {
    User change(Date newBirthday);
}
