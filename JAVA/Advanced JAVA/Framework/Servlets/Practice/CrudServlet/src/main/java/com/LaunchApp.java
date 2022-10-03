package com;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class LaunchApp {
    public static void main(String[] args) {
        Configuration configuration = new Configuration().configure("Hibernate.cfg.xml");
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        
    }
}
