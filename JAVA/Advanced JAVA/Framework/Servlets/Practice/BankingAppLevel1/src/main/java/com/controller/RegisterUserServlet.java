package com.controller;

import com.dao.EmployeeDao;
import com.model.Employee;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
@WebServlet("/RegisterUserServlet")
public class RegisterUserServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("Text/html");
        PrintWriter out = resp.getWriter();
        String name = req.getParameter("name");
        String address = req.getParameter("address");
        String phoneNo = req.getParameter("phoneNo");
        String email = req.getParameter("email");
        String accountPin = req.getParameter("accountPin");
        String accountType = "savings";
        int balance = Integer.parseInt(req.getParameter("balance"));

        //Generating random account number
        Random random = new Random();
        long randomAddition = random.nextInt(1000000000);
        long accountNo = random.nextInt(1000)* randomAddition;

        //setting the data into pojo
        Employee employee = new Employee();

        employee.setAccountNumber(String.valueOf(accountNo));
        employee.setAccountPin(accountPin);
        employee.setAccountType(accountType);
        employee.setAddress(address);
        employee.setEmail(email);
        employee.setPhoneNo(phoneNo);
        employee.setName(name);
        employee.setBalance(balance);


        //sending data using DAO class to database
        EmployeeDao employeeDao = new EmployeeDao();
        employeeDao.getConnection();
        int status = employeeDao.createUser(employee);
        if (status >0 ) {
            out.print("Thank you for registering your account number is " + accountNo);
            int currentBalance = employeeDao.getBalance();
            out.print("your current balance is " + currentBalance);
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("Welcome.html");
            requestDispatcher.include(req,resp);
        }
        else {
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("Welcome.html");
            out.print("Something went wrong");
            requestDispatcher.include(req,resp);
        }


    }
}
