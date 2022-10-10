package com.Devayush.AnimalZooApi.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class HibernateUtils {

    private HibernateUtils() {
    }

    private static EntityManagerFactory entityManagerFactory;
    public static EntityManagerFactory getEntityManagerFactory(){
        entityManagerFactory = Persistence.createEntityManagerFactory("PERSISTENCE");
        return entityManagerFactory;
    }
}
