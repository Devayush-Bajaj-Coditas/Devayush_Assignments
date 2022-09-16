package controller;

import dao.RegisterDao;
import model.UserBean;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
@WebServlet("/DisplayDetails")
public class DisplayDetails extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        RegisterDao registerDao = new RegisterDao();
        PrintWriter out = resp.getWriter();
        List <UserBean>list = new ArrayList<>();
        try {
            list = registerDao.display();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


        out.print("<table border ='1' width = 100%>" +
                "<tr><th>Name</th><th>Email</th><th>Password</th><th>Mobile</th></tr>");

        for(UserBean bean : list){
            out.print("<tr><td>" + bean.getUsername() + "</td><td>"+ bean.getEmail() +
            "</td><td>"+bean.getPassword()+"</td><td>" + bean.getContact() + "</td></tr>");
        }
        out.print("</table>");

        RequestDispatcher dispatcher = req.getRequestDispatcher("AdminHome.html");
        dispatcher.include(req,resp);
    }
}
