package com.Servlets;

import com.connection.SessionGenerator;
import com.model.Student;
import com.model.StudentMarks;
import com.model.Subject;
import org.hibernate.Session;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class FetchAllServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        Session session = new SessionGenerator().getSession();
        List<Student> studentList=session.createQuery("From Student").list();
//        for(int i=0;i<studentList.size();i++)
//        {
//            List<Subject> subjects=studentList.get(i).getSubjects();
//            List<StudentMarks> studentMarks=studentList.get(i).getSubjects().get(0).getMarks();
//
//        }
        out.println(studentList);
    }
}
