package ir.maktab.hibernate.projects.article.features.usermanagement.usecases;

import ir.maktab.hibernate.projects.article.model.User;
import ir.maktab.hibernate.projects.article.features.usermanagement.UserUseCase;

public interface LoginUseCase extends UserUseCase {
    User login(String username, String password);
}
