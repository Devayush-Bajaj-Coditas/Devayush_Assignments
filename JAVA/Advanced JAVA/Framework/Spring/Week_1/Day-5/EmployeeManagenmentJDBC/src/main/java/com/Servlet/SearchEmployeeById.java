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

@WebServlet("/SearchById")
public class SearchEmployeeById extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("Text/html");
        PrintWriter out = resp.getWriter();
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Spring.xml");
        EmployeeDao employeeDao = applicationContext.getBean("empDao",EmployeeDao.class);

        int Id = Integer.parseInt(req.getParameter("id"));
        EmployeeBean employeeBean = employeeDao.getEmployeeById(Id);
        out.print("Name: "+ employeeBean.getName() +"\nId" + employeeBean.getId()+
                "Post " +employeeBean.getPost());
    }
}
