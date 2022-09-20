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

@WebServlet("/TeacherRegistration")
public class TeacherRegistration extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("Text/Html");
        PrintWriter out = resp.getWriter();
        TeacherBean teacherBean = new TeacherBean();
        teacherBean.setId(Integer.parseInt(req.getParameter("TeaId")));
        teacherBean.setFirstName(req.getParameter("TeaFirstName"));
        teacherBean.setLastName(req.getParameter("TeaLastName"));
        teacherBean.setPassword(req.getParameter("TeaPassword"));
        teacherBean.setEmail(req.getParameter("TeaEmail"));
        teacherBean.setMobileNo(req.getParameter("TeaMobile"));
        int status =new TeacherDao().registerTeacher(teacherBean);
        if(status > 0){
            out.print("Registration successful\n");
        }
        else
            out.print("Something went wrong\n");
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("index.html");
        requestDispatcher.include(req,resp);
    }
}
