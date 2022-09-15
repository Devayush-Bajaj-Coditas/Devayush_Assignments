package controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/Login")
public class AdminServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        String username = req.getParameter("username");
        String password = req.getParameter("password");

        if(username.equals("admin") && password.equals("admin123")) {
            RequestDispatcher dispatcher = req.getRequestDispatcher("AdminHome.html");
            dispatcher.forward(req,resp);
        }
        else {
            out.println("Invalid User");
            RequestDispatcher dispatcher = req.getRequestDispatcher("index.jsp");
            dispatcher.include(req,resp);
        }
    }
}
