package com.dao;

import com.bean.Employee;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import javax.persistence.Query;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;


public class EmpDao {
static Configuration configuration = new Configuration().configure("Employee.cfg.xml");//c
// s

Employee employee = new Employee();
BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

public void create() {
    try {
        System.out.println("Enter name");
        String name = bufferedReader.readLine();
        System.out.println("Enter Address");
        String address = bufferedReader.readLine();

        employee.setName(name);
        employee.setAddress(address);

        Session session = configuration.buildSessionFactory().openSession();
// t
        Transaction transaction = session.beginTransaction();

        int status = (int) session.save(employee);

        if (status > 0) {
            transaction.commit();
            System.out.println("Inserted success");
        } else
            System.out.println("Something went wrong");

    } catch (Exception e) {
    }

}
    public void fetchById(){
        System.out.println("Enter id ");
        try {
            int id = Integer.parseInt(bufferedReader.readLine());

            Session session = configuration.buildSessionFactory().openSession();
// t
            Transaction transaction = session.beginTransaction();

            employee = session.get(Employee.class,id);
            transaction.commit();
            System.out.println(employee);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public void update(){
    try {
        System.out.println("Enter id you want to update");
        int id = Integer.parseInt(bufferedReader.readLine());
        System.out.println("Enter new Address");
        String newAddress = bufferedReader.readLine();

        Session session = configuration.buildSessionFactory().openSession();
// t
        Transaction transaction = session.beginTransaction();


        Query query= session.createQuery("update Employee set address  = :x where id = :y");
        query.setParameter("x" ,newAddress);
        query.setParameter("y",id);
        int status =query.executeUpdate();
        if (status> 0){
            System.out.println("Updated");
            transaction.commit();
        }
        else {
            System.out.println("Something went wrong");
        }
        }
    catch (Exception e){
        e.printStackTrace();
    }


    }


    public static List<Employee> fetchByRestriction(String name) {
        Session session = configuration.buildSessionFactory().openSession();
        Criteria criteria = session.createCriteria(Employee.class);
        criteria.add(Restrictions.gt("name",name));
        return criteria.list();
    }

    public static List<Employee> fetchByOrder(String order,String name){
    Session session = configuration.buildSessionFactory().openSession();
    Criteria criteria = session.createCriteria(Employee.class);
    if(order.equalsIgnoreCase("asc")) {
        criteria.addOrder(Order.asc(name));
    }
    else if (order.equalsIgnoreCase("desc")){
        criteria.addOrder(Order.desc(name));
    }
    return criteria.list();
    }


    public static List<Employee> fetchByProjection(String name){
    Session session = configuration.buildSessionFactory().openSession();
    Criteria criteria = session.createCriteria(Employee.class);
    criteria.setProjection(Projections.property(name));
    return criteria.list();
    }



}
