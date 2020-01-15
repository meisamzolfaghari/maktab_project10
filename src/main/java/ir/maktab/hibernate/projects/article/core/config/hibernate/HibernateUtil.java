package ir.maktab.hibernate.projects.article.core.config.hibernate;

import ir.maktab.hibernate.projects.article.entities.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

    private static SessionFactory sessionFactory;
    private static Session session;

    static {
        sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Article.class)
                .addAnnotatedClass(Category.class)
                .addAnnotatedClass(Role.class)
                .addAnnotatedClass(Tag.class)
                .addAnnotatedClass(User.class)
                .buildSessionFactory();
        session = sessionFactory.openSession();
    }

    public static Session getSession(){ return session; }

}
