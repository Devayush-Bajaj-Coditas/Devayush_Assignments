package com.Servlets;

import com.connection.SessionGenerator;
import com.model.Student;
import com.model.Subject;
import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/RegisterStudent")
public class RegisterStudentServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("Text/html");
        String name = req.getParameter("studentName");
        int rollNumber = Integer.parseInt(req.getParameter("rollNumber"));
        String address = req.getParameter("studentAddress");
        long phoneNumber = Long.parseLong(req.getParameter("studentPhoneNumber"));

        Student student = new Student(name,rollNumber,address,phoneNumber);
        student.setSubjects(null);
        Session session = new SessionGenerator().getSession();
        session.save(student);


        Transaction transaction = session.beginTransaction();
        transaction.commit();


    }
}
