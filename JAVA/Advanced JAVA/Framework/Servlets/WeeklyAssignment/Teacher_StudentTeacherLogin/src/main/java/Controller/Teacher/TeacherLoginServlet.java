package Controller.Teacher;

import Dao.TeacherDao;
import Model.bean.TeacherBean;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/TeacherLogin")
public class TeacherLoginServlet extends HttpServlet {
    TeacherBean teacherBean = new TeacherBean();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("Text/html");
        PrintWriter out =resp.getWriter();
        teacherBean.setEmail(req.getParameter("email"));
        teacherBean.setPassword(req.getParameter("password"));
        boolean status = new TeacherDao().teacherLogin(teacherBean);
        if(status == true){
            out.print("login success");
            //RequestDispatcher requestDispatcher = req.getRequestDispatcher("WelcomeTeacher");
            //requestDispatcher.forward(req,resp);
        }
        else {
            out.print("Email or password is incorrect");
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("index.html");
            requestDispatcher.include(req,resp);
        }
    }
}
