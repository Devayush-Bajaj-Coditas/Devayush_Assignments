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
import java.util.Iterator;
import java.util.List;
@WebServlet("/ShowAllEmployees")
public class ShowAllEmployees extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Spring.xml");
        EmployeeDao employeeDao = applicationContext.getBean("empDao",EmployeeDao.class);
        List<EmployeeBean> employeeBeanList = employeeDao.getAllEmployees();
        Iterator iterator = employeeBeanList.iterator();
        out.print("<Table border='1'>");
        for(EmployeeBean employeeBean : employeeBeanList) {
            out.print("<tr><td>"+employeeBean.getId() +"</td>" +
                    "<td>" +employeeBean.getName() +"</td></tr>"+
                    "<td>" + employeeBean.getCity() + "</td></tr>"+
                    "<tr>"+ employeeBean.getPost() + "</td><tr>");

        }
//        while(iterator.hasNext()){
//            out.print("<tr><td>"+iterator.next() +"</td></tr>");
//        }
        out.print("</Table>");
    }
}
