package com.practice.HibernateCRUD.dao;

import com.practice.HibernateCRUD.model.Laptop;
import com.practice.HibernateCRUD.model.Student;
import com.practice.HibernateCRUD.util.GetSessionFactory;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Service;

import java.util.Iterator;
import java.util.List;

@Service
public class DaoImplimentation implements StudentDao{


    @Override
    public void setData(Student student) {
        Session session = GetSessionFactory.getSession().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(student);
        List<Laptop> laptops = student.getLaptops();

//        laptops.stream().forEach(laptop -> session.save(laptop));
        student.setLaptops(laptops);
        session.save(student);
        transaction.commit();
    }

    @Override
    public List<Student> getAllData() {
        Session session = GetSessionFactory.getSession().openSession();
        List<Student> students = session.createQuery("from Student").list();
        return students;
    }
}
