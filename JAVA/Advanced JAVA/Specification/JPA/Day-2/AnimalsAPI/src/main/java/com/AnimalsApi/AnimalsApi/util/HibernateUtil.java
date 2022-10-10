package com.AnimalsApi.AnimalsApi.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.criteria.internal.expression.ConcatExpression;

public class HibernateUtil {
    public static SessionFactory sessionFactory = null;

    public static SessionFactory getSessionFactory(){
        if(sessionFactory == null){
            Configuration configuration = new Configuration();
            configuration.configure("Hibernate.cfg.xml");
            sessionFactory = configuration.buildSessionFactory();
        }
        return sessionFactory;
    }
}
