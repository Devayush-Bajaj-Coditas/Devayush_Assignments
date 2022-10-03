package com.dao;

import com.model.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateSession {

    public void commit(Object modelname){
        Configuration configuration = new Configuration().configure("Hibernate.cfg.xml");
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction =  session.beginTransaction();
        session.save(modelname);
        transaction.commit();
    }
}
