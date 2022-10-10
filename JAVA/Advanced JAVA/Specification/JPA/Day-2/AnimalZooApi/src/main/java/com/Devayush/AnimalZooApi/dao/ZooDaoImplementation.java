package com.Devayush.AnimalZooApi.dao;

import com.Devayush.AnimalZooApi.model.Zoo;
import com.Devayush.AnimalZooApi.util.HibernateUtils;

import javax.persistence.EntityManager;

public class ZooDaoImplementation implements ZooDao{
    @Override
    public void addZoo(Zoo zoo) {
        EntityManager entityManager = HibernateUtils.getEntityManagerFactory().createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(zoo);
        entityManager.close();
    }

    @Override
    public void getZoo(int id) {

    }

    @Override
    public void updateZoo(Zoo zoo) {

    }

    @Override
    public void deleteZoo(int id) {

    }
}
