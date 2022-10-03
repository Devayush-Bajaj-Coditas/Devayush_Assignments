package com.dao;

import com.model.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateConfigrations implements CRUD{
    Session session = null;
    public Session getSession(){
        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        return session;
    }
    @Override
    public void create(Object model){
        getSession();
        Transaction transaction = session.beginTransaction();
        session.save(model);
        transaction.commit();
    }

    @Override
    public void readByID(int id) {
        Student student = (Student)session.get(Student.class,id);
    }

    @Override
    public void update() {

    }

    @Override
    public void delete() {

    }
}
