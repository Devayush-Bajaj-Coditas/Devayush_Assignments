package com.practice.HibernateCRUD.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class GetSessionFactory {
    private static SessionFactory sessionFactory = null;
    public static SessionFactory getSession(){
        if(sessionFactory == null) {
            sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        }
        return sessionFactory;
    }
}
