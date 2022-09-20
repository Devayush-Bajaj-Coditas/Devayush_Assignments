package Controller.Student;

import Dao.StudentDao;
import Model.bean.StudentBean;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/StudentLogin")

public class StudentLoginServlet extends HttpServlet {
    StudentBean studentBean = new StudentBean();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        studentBean.setStu_email(req.getParameter("email"));
        studentBean.setStu_password(req.getParameter("password"));
        boolean status = new StudentDao().loginStudent(studentBean);
        if (status == true){
            HttpSession session = req.getSession();
            session.setAttribute("username",studentBean.getStu_firstName());
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("WelcomeStudentServlet");
            requestDispatcher.forward(req,resp);
        }
        else {
            out.print("invalid username or password");
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("index.html");
            requestDispatcher.include(req,resp);
        }

    }
}
