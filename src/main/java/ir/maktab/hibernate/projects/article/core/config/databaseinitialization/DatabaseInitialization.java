package ir.maktab.hibernate.projects.article.core.config.databaseinitialization;

import ir.maktab.hibernate.projects.article.core.AllRoles;
import ir.maktab.hibernate.projects.article.model.*;
import ir.maktab.hibernate.projects.article.repositories.CategoryRepository;
import ir.maktab.hibernate.projects.article.repositories.RoleRepository;
import ir.maktab.hibernate.projects.article.repositories.TagRepository;
import ir.maktab.hibernate.projects.article.repositories.UserRepository;
import ir.maktab.hibernate.projects.article.userinterface.functions.Roles;
import ir.maktab.hibernate.projects.article.userinterface.functions.Users;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class DatabaseInitialization {
    public static void execute() {
        roleInitialize();
        adminInitialize();
        categoryInitialize();
        tagInitialize();
    }

    public static void roleInitialize() {
        RoleRepository roleRepository = RoleRepository.getInstance();
        if (roleRepository.findAll().isEmpty()) {
            roleRepository.saveDb(new Role(AllRoles.writer.name(), new ArrayList<>()));
            roleRepository.saveDb(new Role(AllRoles.manager.name(), new ArrayList<>()));
            roleRepository.saveDb(new Role(AllRoles.admin.name(), new ArrayList<>()));

            roleRepository.saveDb2(new Role(AllRoles.writer.name(), new ArrayList<>()));
            roleRepository.saveDb2(new Role(AllRoles.manager.name(), new ArrayList<>()));
            roleRepository.saveDb2(new Role(AllRoles.admin.name(), new ArrayList<>()));
        }
    }

    public static void adminInitialize() {
        UserRepository userRepository = UserRepository.getInstance();
        List<User> users = userRepository.findAll();
        if (users.isEmpty() || users.stream().noneMatch(Users::isAdmin)) {
            userRepository.saveDb(new User(AllRoles.admin.name(), "123"
                    , new Date(System.currentTimeMillis()), "123"
                    , new ArrayList<>(
                    Arrays.asList(
                            Roles.getAdminRole()
                            , Roles.getManagerRole()
                            , Roles.getWriterRole()))
                    , new Address("", "", "", "")));

            userRepository.saveDb2(new User(AllRoles.admin.name(), "123"
                    , new Date(System.currentTimeMillis()), "123"
                    , new ArrayList<>(
                    Arrays.asList(
                            Roles.getAdminRole()
                            , Roles.getManagerRole()
                            , Roles.getWriterRole()))
                    , new Address("", "", "", "")));
        }
    }

    public static void categoryInitialize() {
        CategoryRepository categoryRepository = CategoryRepository.getInstance();
        if (categoryRepository.findAll().isEmpty()) {
            categoryRepository.saveDb(new Category("category1", "decription1", new ArrayList<>()));
            categoryRepository.saveDb(new Category("category2", "decription2", new ArrayList<>()));
            categoryRepository.saveDb(new Category("category3", "decription3", new ArrayList<>()));
            categoryRepository.saveDb(new Category("category4", "decription4", new ArrayList<>()));
            categoryRepository.saveDb(new Category("category5", "decription5", new ArrayList<>()));

            categoryRepository.saveDb2(new Category("category1", "decription1", new ArrayList<>()));
            categoryRepository.saveDb2(new Category("category2", "decription2", new ArrayList<>()));
            categoryRepository.saveDb2(new Category("category3", "decription3", new ArrayList<>()));
            categoryRepository.saveDb2(new Category("category4", "decription4", new ArrayList<>()));
            categoryRepository.saveDb2(new Category("category5", "decription5", new ArrayList<>()));
        }
    }

    public static void tagInitialize() {
        TagRepository tagRepository = TagRepository.getInstance();
        if (tagRepository.findAll().isEmpty()) {
            tagRepository.saveDb(new Tag("tag1", new ArrayList<>()));
            tagRepository.saveDb(new Tag("tag2", new ArrayList<>()));
            tagRepository.saveDb(new Tag("tag3", new ArrayList<>()));
            tagRepository.saveDb(new Tag("tag4", new ArrayList<>()));
            tagRepository.saveDb(new Tag("tag5", new ArrayList<>()));

            tagRepository.saveDb2(new Tag("tag1", new ArrayList<>()));
            tagRepository.saveDb2(new Tag("tag2", new ArrayList<>()));
            tagRepository.saveDb2(new Tag("tag3", new ArrayList<>()));
            tagRepository.saveDb2(new Tag("tag4", new ArrayList<>()));
            tagRepository.saveDb2(new Tag("tag5", new ArrayList<>()));
        }
    }

}
