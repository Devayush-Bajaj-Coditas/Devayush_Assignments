package com.Servlets;

import com.connection.SessionGenerator;
import com.model.Subject;
import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/registerSubject")
public class RegisterSubjectServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        String subjectName = req.getParameter("subjectName");
        int subjectId = Integer.parseInt(req.getParameter("subjectId"));

        Subject subject = new Subject(subjectId,subjectName);

        Session session = new SessionGenerator().getSession();
        session.save(subject);
        Transaction transaction = session.beginTransaction();
        transaction.commit();

    }
}
