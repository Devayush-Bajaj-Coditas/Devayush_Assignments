package com.AnimalsApi.AnimalsApi.dao;

import com.AnimalsApi.AnimalsApi.model.Animal;
import com.AnimalsApi.AnimalsApi.model.Zoo;
import com.AnimalsApi.AnimalsApi.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class ZooDaoImplementation implements ZooDao{
    @Override
    public void saveZoo(Zoo zoo) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()){
            transaction = session.beginTransaction();
            session.save(zoo);
            transaction.commit();
        }catch (Exception e){
            if(transaction != null){
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    @Override
    public void updateZoo(Zoo zoo) {

    }

    @Override
    public void deleteZoo(int id) {

    }

    @Override
    public Animal getZoo(int id) {
        return null;
    }
}
