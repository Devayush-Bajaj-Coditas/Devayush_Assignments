package com.controller;

import com.model.Balance;
import com.model.Employee;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/DepositServlet")
public class DepositServlet extends HttpServlet {
Employee employee = new Employee();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        String accountNo = req.getParameter("accountNo");
        String pin = req.getParameter("accountPin");
        int depositAmt = Integer.parseInt(req.getParameter("depositAmt"));

        //setting data into pure old java object

        employee.setBalance(depositAmt);
        employee.setAccountNumber(accountNo);
        employee.setAccountPin(pin);

    }
}
/