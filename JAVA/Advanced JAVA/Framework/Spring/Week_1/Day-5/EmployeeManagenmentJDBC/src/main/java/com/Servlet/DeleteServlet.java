package com.Servlet;

import com.Bean.EmployeeBean;
import com.Dao.EmployeeDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/DeleteServlet")
public class DeleteServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("Text/html");
        PrintWriter out = resp.getWriter();

        int id= Integer.parseInt(req.getParameter("id"));

        ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
        EmployeeDao employeeDao = context.getBean("empDao",EmployeeDao.class);

        /*EmployeeBean employeeBean = new EmployeeBean();
        employeeBean.setId(id);*/

        int status = employeeDao.Delete(id);

        if (status > 0){
            out.print("Deleted");
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("AdminHome.html");
            requestDispatcher.include(req,resp);
        }
        else {
            out.print("SSomething went wrong");
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("AdminHome.html");
            requestDispatcher.include(req,resp);
        }



    }
}
