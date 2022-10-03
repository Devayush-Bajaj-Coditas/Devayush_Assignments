package com.controller;

import com.dao.HibernateConfigrations;
import com.model.Address;
import com.model.Course;
import com.model.Laptop;
import com.model.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@WebServlet("/registerServlet")
public class RegisterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String name = req.getParameter("name");
        String area = req.getParameter("area");
        String city = req.getParameter("city");
        Address address = new Address(area,city);

        //one to one
        Course course  =  new Course(5,"Java");

        //one to many
        Laptop laptop = new Laptop(1,"Dell");
        Laptop laptop1 = new Laptop(2,"Hp");
        Laptop laptop2 = new Laptop(3 , "Asus");
        List <Laptop> laptopList = new ArrayList<Laptop>();
        laptopList.add(laptop);
        laptopList.add(laptop1);
        laptopList.add(laptop2);


        //Adding to student constructor
        Student student = new Student(1,name,address,course,laptopList);
        //course.setStudent(student);  --> not working
        Session session = new HibernateConfigrations().getSession();
        Transaction transaction = session.beginTransaction();


        session.save(student);
        transaction.commit();

    }
}
