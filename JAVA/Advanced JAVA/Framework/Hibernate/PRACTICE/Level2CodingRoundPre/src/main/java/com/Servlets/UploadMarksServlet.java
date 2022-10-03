package com.Servlets;

import com.connection.SessionGenerator;
import com.model.Student;
import com.model.StudentMarks;
import com.model.Subject;
import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
@WebServlet("/uploadMarksServlet")
public class UploadMarksServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        Session session = new SessionGenerator().getSession();

        int studentId = Integer.parseInt(req.getParameter("studentId"));
        int subjectId = Integer.parseInt(req.getParameter("subjectId"));
        float marks  =Float.parseFloat(req.getParameter("marks"));
        Student student = (Student) session.get(Student.class,studentId);
        Subject subject = (Subject) session.get(Subject.class,subjectId);


        if(student != null && subject != null){
            List<Subject> subjects = new ArrayList<>();
            subjects.add(subject);
            StudentMarks studentMarks = new StudentMarks(studentId,subjectId,marks);
            session.save(studentMarks);
            session.save(student);
            Transaction transaction = session.beginTransaction();
            transaction.commit();


        }
        else{
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("index.html");
            out.print("your student id or subject id is incorrect");
            requestDispatcher.include(req,resp);
        }

    }
}
