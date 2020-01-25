package ir.maktab.hibernate.projects.article.features.usermanagement.usecases;

import ir.maktab.hibernate.projects.article.model.User;
import ir.maktab.hibernate.projects.article.features.usermanagement.UserUseCase;

public interface DeleteUserByAdminUseCase extends UserUseCase {
    Boolean delete(User user);
}
