package Controller.Student;

import Dao.StudentDao;
import Model.bean.StudentBean;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/StudentRegistration")
public class StudentRegisterServlet extends HttpServlet {

    StudentBean studentBean = new StudentBean();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      resp.setContentType("Text/html");
       PrintWriter out = resp.getWriter();
        studentBean.setStu_id(Integer.parseInt(req.getParameter("StuId")));
        studentBean.setStu_firstName(req.getParameter("StuFirstName"));
        studentBean.setStu_lastName(req.getParameter("StuLastName"));
        studentBean.setStu_password(req.getParameter("StuPassword"));
        studentBean.setStu_email(req.getParameter("StuEmail"));
        studentBean.setStu_mobileNo(req.getParameter("StuMobile"));
        int status = new StudentDao().registerStudent(studentBean);

        if (status > 0 ){
            out.println("Registration successful pay 500Rs to complete \n Upi Id: 7509810259@paytm");
        }
        else
            out.println("Something went wrong");
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("index.html");
        requestDispatcher.include(req,resp);
    }
}
