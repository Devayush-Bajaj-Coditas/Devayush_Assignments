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
        Iterator iterator = list.iterator();
        while(iterator.hasNext()){
            out.println(iterator.next()+ "<br>");
        }
        RequestDispatcher dispatcher = req.getRequestDispatcher("AdminHome.html");
        dispatcher.include(req,resp);
    }
}
