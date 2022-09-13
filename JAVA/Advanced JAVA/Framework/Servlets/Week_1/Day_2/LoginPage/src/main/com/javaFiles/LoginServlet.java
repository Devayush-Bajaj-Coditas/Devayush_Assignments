package com.javaFiles;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Locale;

@WebServlet("LoginServlet")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        String username = req.getParameter("username");
        ServletContext application = getServletContext();
        application.setAttribute("Username",username);
        String password = req.getParameter("password");

        if (password.equals(username)){
            RequestDispatcher requestDispatcher = req.getRequestDispatcher(" WelcomeUserServlet");
            requestDispatcher.forward(req,resp);


        }
        else{
            out.println("Please check your username and password");
        }
    }
}
