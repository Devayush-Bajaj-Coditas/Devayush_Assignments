package com.AnimalsApi.AnimalsApi.dao;

import com.AnimalsApi.AnimalsApi.model.Animal;
import com.AnimalsApi.AnimalsApi.util.HibernateUtil;
import com.sun.deploy.security.SelectableSecurityManager;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class AnimalDaoImplementation implements AnimalDao {
    @Override
    public void saveAnimal(Animal animal) {
        Transaction transaction = null;
      try (Session session = HibernateUtil.getSessionFactory().openSession()){
        transaction = session.beginTransaction();
        session.save(animal);
        transaction.commit();
      }catch (Exception e){
          if(transaction != null){
              transaction.rollback();
          }
          e.printStackTrace();
      }
    }

    @Override
    public void updateAnimal(Animal animal) {

    }

    @Override
    public void deleteAnimal(int id) {

    }

    @Override
    public Animal getAnimal(int id) {
        return null;
    }
}
