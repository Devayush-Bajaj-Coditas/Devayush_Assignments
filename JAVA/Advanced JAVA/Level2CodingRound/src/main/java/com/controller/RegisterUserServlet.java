package com.controller;

import com.model.SimUser;
import com.util.MobileNumberGenerator;
import com.util.SessionGenerator;
import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/RegisterUser")
public class RegisterUserServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        String name = req.getParameter("userName");
        String email = req.getParameter("email");
        String address = req.getParameter("address");
        long aadharNumber = Long.parseLong(req.getParameter("aadhar"));
        String simType = req.getParameter("simType");
        float balance = Float.parseFloat(req.getParameter("balance"));

        long mobileNumber = new MobileNumberGenerator().getNewNumber();
        float validityDays = 30;

        SimUser simUser = new SimUser(1,name,email,address,aadharNumber,simType,balance,validityDays,mobileNumber);

        Session session = new SessionGenerator().getSession();

        Transaction transaction = session.beginTransaction();
        session.save(simUser);
        transaction.commit();

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("index.html");
        out.print("You have successfully registered with us\n Your new mobile number is --> " + mobileNumber + "\n Validity of plan --> "+ validityDays+"Days\nThank you for choosing us ");
        requestDispatcher.include(req,resp);

    }
}
