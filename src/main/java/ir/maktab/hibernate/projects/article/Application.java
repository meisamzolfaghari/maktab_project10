package ir.maktab.hibernate.projects.article;

import ir.maktab.hibernate.projects.article.core.config.databaseinitialization.DatabaseInitialization;
import ir.maktab.hibernate.projects.article.userinterface.menus.FirstMenu;

public class Application {

    public static void main(String[] args) {
        DatabaseInitialization.execute();
        new FirstMenu().execute();
    }
}
