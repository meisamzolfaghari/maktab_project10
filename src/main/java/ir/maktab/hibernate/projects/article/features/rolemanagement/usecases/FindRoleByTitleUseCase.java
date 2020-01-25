package ir.maktab.hibernate.projects.article.features.rolemanagement.usecases;

import ir.maktab.hibernate.projects.article.model.Role;
import ir.maktab.hibernate.projects.article.features.rolemanagement.RoleUseCase;

public interface FindRoleByTitleUseCase extends RoleUseCase {
    Role find(String title);
}
