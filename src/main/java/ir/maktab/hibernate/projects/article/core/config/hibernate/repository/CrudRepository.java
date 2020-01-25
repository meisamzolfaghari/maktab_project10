package ir.maktab.hibernate.projects.article.core.config.hibernate.repository;

import ir.maktab.hibernate.projects.article.core.config.hibernate.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import javax.sound.midi.Soundbank;
import java.io.Serializable;
import java.util.List;

public abstract class CrudRepository<Entity, ID extends Serializable> {

    protected abstract Class<Entity> getEntityClass();

    public ID saveDb(Entity entity) {

        Session sessionDb = getSessionFactoryDb().openSession();
        sessionDb.beginTransaction();
        ID id = (ID) sessionDb.save(entity);
        sessionDb.getTransaction().commit();
        sessionDb.close();

        return id;
    }

    public ID saveDb2(Entity entity) {
        Session sessionDb2 = getSessionFactoryDb2().openSession();
        sessionDb2.beginTransaction();
        ID id = (ID) sessionDb2.save(entity);
        sessionDb2.getTransaction().commit();
        sessionDb2.close();

        return id;
    }

    public void updateDb(Entity entity) {
        Session sessionDb = getSessionFactoryDb().openSession();
        sessionDb.beginTransaction();
        sessionDb.update(entity);
        sessionDb.getTransaction().commit();
        sessionDb.close();
    }

    public void updateDb2(Entity entity) {
        Session sessionDb2 = getSessionFactoryDb2().openSession();
        sessionDb2.beginTransaction();
        sessionDb2.update(entity);
        sessionDb2.getTransaction().commit();
        sessionDb2.close();
    }

    public void removeDb(Entity entity) {
        Session sessionDb = getSessionFactoryDb().openSession();
        sessionDb.beginTransaction();
        sessionDb.remove(entity);
        sessionDb.getTransaction().commit();
        sessionDb.close();
    }

    public void removeDb2(Entity entity) {
        Session sessionDb2 = getSessionFactoryDb2().openSession();
        sessionDb2.beginTransaction();
        sessionDb2.remove(entity);
        sessionDb2.getTransaction().commit();
        sessionDb2.close();
    }

    public void removeById(ID id) {
        Entity entity = findById(id);
        if (entity != null) {
            Session sessionDb = getSessionFactoryDb().openSession();
            sessionDb.beginTransaction();
            sessionDb.remove(entity);
            sessionDb.getTransaction().commit();
            sessionDb.close();
        }
    }

    public Entity findById(ID id) {
        Session sessionDb = getSessionFactoryDb().openSession();
        sessionDb.beginTransaction();
        Entity entity = sessionDb.get(getEntityClass(), id);
        sessionDb.getTransaction().commit();
        return entity;
    }

    public List<Entity> findAll() {
        Session sessionDb = getSessionFactoryDb().openSession();
        sessionDb.beginTransaction();
        Query<Entity> query = sessionDb
                .createQuery("from " + getEntityClass().getName(), getEntityClass());
        List<Entity> entities = query.list();
        sessionDb.getTransaction().commit();
        return entities;
    }

    public List<Entity> findAll(int start, int row) {
        Session sessionDb = getSessionFactoryDb().openSession();
        sessionDb.beginTransaction();
        Query<Entity> query = sessionDb
                .createQuery("from " + getEntityClass().getName(), getEntityClass());
        query.setFirstResult(start);
        query.setMaxResults(row);
        List<Entity> entities = query.list();
        sessionDb.getTransaction().commit();
        return entities;
    }

    private SessionFactory getSessionFactoryDb() {
        return HibernateUtil.getSessionFactoryDb();
    }

    private SessionFactory getSessionFactoryDb2() {
        return HibernateUtil.getSessionFactoryDb2();
    }

}
