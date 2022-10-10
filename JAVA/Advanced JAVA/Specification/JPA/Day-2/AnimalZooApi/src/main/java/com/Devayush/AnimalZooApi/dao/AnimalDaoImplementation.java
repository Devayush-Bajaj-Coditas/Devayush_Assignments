package com.Devayush.AnimalZooApi.dao;

import com.Devayush.AnimalZooApi.model.Animal;
import com.Devayush.AnimalZooApi.util.HibernateUtils;

import javax.persistence.Entity;
import javax.persistence.EntityManager;

public class AnimalDaoImplementation implements AnimalDao {
    @Override
    public void insertAnimal(Animal animal) {
        EntityManager entityManager = HibernateUtils.getEntityManagerFactory().createEntityManager();
        entityManager.getTransaction().begin();

       entityManager.getTransaction().begin();
        entityManager.persist(animal);
        entityManager.getTransaction().commit();
    }

    @Override
    public void getAnimal(int id) {

    }

    @Override
    public void updateAnimal(Animal animal) {

    }

    @Override
    public void deleteAnimal(int id) {

    }
}
