package com.javaFiles;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.security.Principal;
@WebServlet("/WelcomeUserServlet")
public class WelcomeUserServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("Text/HTML");
        PrintWriter out = resp.getWriter();
        ServletContext application = getServletContext();

        out.println("welcome " + application.getAttribute("Username"));
    }
}
