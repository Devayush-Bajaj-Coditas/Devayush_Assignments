package com.controller;

import com.exceptions.UserDoesNotExistException;
import com.model.SimUser;
import com.util.SessionGenerator;
import com.util.ValidateMobileNumber;
import org.hibernate.Session;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/CheckValidity")
public class CheckValidityServlert extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("Text/html");
        PrintWriter out = resp.getWriter();
        Session session = new SessionGenerator().getSession();
        long mobileNumber = Long.parseLong(req.getParameter("mobileNumber"));
        ValidateMobileNumber validateMobileNumber = new ValidateMobileNumber();
        boolean status = validateMobileNumber.validate(mobileNumber);
        if (status == false){
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("index.html");
            out.println("invalid mobile number");
            requestDispatcher.include(req,resp);

        }
        else{
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("index.html");
            SimUser simUser = session.get(SimUser.class,new String(String.valueOf(7)));
            out.print("name : " + session.get(SimUser.class,simUser.getName()));
            out.println("Balance : " + session.get(SimUser.class,simUser.getBalance()));
            out.println("validity : " + session.get(SimUser.class,simUser.getValidityDays()));
            requestDispatcher.include(req,resp);

        }



    }
}
