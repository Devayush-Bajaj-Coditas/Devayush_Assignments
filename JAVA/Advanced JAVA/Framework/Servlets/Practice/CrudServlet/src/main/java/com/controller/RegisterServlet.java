package com.controller;

import com.dao.HibernateSession;
import com.model.Address;
import com.model.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("Text/html");
        String name = req.getParameter("name");
        int pincode = Integer.parseInt(req.getParameter("pincode"));
        String houseNo = req.getParameter("homeNo");
        String area = req.getParameter("area");
        String city = req.getParameter("city");

        Address address = new Address();
        address.setArea(area);
        address.setCity(city);
        address.setHouseNo(houseNo);
        address.setPincode(pincode);

        Student student = new Student();
        //student.setAddress(address);
        student.setName(name);


        //Hibernate

        HibernateSession hibernateSession = new HibernateSession();
        hibernateSession.commit(student);
/*        Configuration configuration = new Configuration().configure("Hibernate.cfg.xml");
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction =  session.beginTransaction();
        session.save(student);
        transaction.commit();*/

/*        RequestDispatcher requestDispatcher = req.getRequestDispatcher("LaunchApp");
        requestDispatcher.forward(req,resp);*/

    }
}
