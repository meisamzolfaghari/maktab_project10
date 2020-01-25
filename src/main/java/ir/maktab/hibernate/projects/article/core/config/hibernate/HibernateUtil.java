package ir.maktab.hibernate.projects.article.core.config.hibernate;

import ir.maktab.hibernate.projects.article.model.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

    private static SessionFactory sessionFactoryDb;
//    private static Session sessionDb;

    private static SessionFactory sessionFactoryDb2;
//    private static Session sessionDb2;

    private static SessionFactory sessionFactoryH2;
    private static Session sessionH2;

    static {
        sessionFactoryDb = new Configuration()
                .configure("hibernate.db.cfg.xml")
                .addAnnotatedClass(Address.class)
                .addAnnotatedClass(Article.class)
                .addAnnotatedClass(Category.class)
                .addAnnotatedClass(Role.class)
                .addAnnotatedClass(Tag.class)
                .addAnnotatedClass(User.class)
                .buildSessionFactory();

        sessionFactoryDb2 = new Configuration()
                .configure("hibernate.db2.cfg.xml")
                .addAnnotatedClass(Address.class)
                .addAnnotatedClass(Article.class)
                .addAnnotatedClass(Category.class)
                .addAnnotatedClass(Role.class)
                .addAnnotatedClass(Tag.class)
                .addAnnotatedClass(User.class)
                .buildSessionFactory();

        sessionFactoryH2 = new Configuration()
                .configure("hibernate.h2.cfg.xml")
                .addAnnotatedClass(Address.class)
                .addAnnotatedClass(Article.class)
                .addAnnotatedClass(Category.class)
                .addAnnotatedClass(Role.class)
                .addAnnotatedClass(Tag.class)
                .addAnnotatedClass(User.class)
                .buildSessionFactory();

//        sessionDb = sessionFactoryDb.openSession();

//        sessionDb2 = sessionFactoryDb2.openSession();

        sessionH2 = sessionFactoryH2.openSession();
    }

    public static SessionFactory getSessionFactoryDb() {
        return sessionFactoryDb;
    }

    public static SessionFactory getSessionFactoryDb2() {
        return sessionFactoryDb2;
    }

    public static Session getSessionH2() {
        return sessionH2;
    }

}
