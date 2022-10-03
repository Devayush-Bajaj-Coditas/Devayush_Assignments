package com.controller;

import com.dao.HibernateConfigrations;
import com.model.Student;
import org.hibernate.Session;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/GetDetailsById")
public class GetDetailsById extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        Student student;
        int id = Integer.parseInt(req.getParameter("id"));
        Session session = new HibernateConfigrations().getSession();
        student = session.get(Student.class,id);
        out.print(student);



    }
}
