package com.Servlet;

import com.Bean.EmployeeBean;
import com.Dao.EmployeeDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/RegisterUserServlet")
public class RegisterUserServlet  extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        int id = Integer.parseInt(req.getParameter("id"));
        String name = req.getParameter("name");
        String post = req.getParameter("post");
        Float salary = Float.parseFloat(req.getParameter("salary"));
        String city = req.getParameter("city");


        EmployeeBean employeeBean = new EmployeeBean();
         employeeBean.setId(id);
         employeeBean.setName(name);
         employeeBean.setPost(post);
         employeeBean.setSalary(salary);
         employeeBean.setCity(city);

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Spring.xml");
        EmployeeDao employeeDao = applicationContext.getBean("empDao", EmployeeDao.class);

        int status = employeeDao.registerEmployee(employeeBean);
        if (status > 0){
            out.print("Registered successful");
        }
        else
            out.print("something went wrong");

    }
}
