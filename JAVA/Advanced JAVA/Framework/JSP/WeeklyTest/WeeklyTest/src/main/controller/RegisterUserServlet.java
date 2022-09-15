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
import java.sql.SQLException;

@WebServlet("/RegisterUserServlet")
public class RegisterUserServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        String username = req.getParameter("username");
        String email = req.getParameter("email");
        String password = req.getParameter("password");
        String mobile = req.getParameter("mobile");

        UserBean userBean = new UserBean();
        userBean.setUsername(username);
        userBean.setEmail(email);
        userBean.setPassword(password);
        userBean.setContact(mobile);

        RegisterDao registerDao = new RegisterDao();
        try {
            PrintWriter out = resp.getWriter();
            int status =  registerDao.save(userBean);
            if(status >0){
                out.println("Successfully inserted");
                RequestDispatcher dispatcher = req.getRequestDispatcher("AdminHome.html");
                dispatcher.include(req,resp);
           }
            else {
                out.println("Something went wrong");
                RequestDispatcher dispatcher = req.getRequestDispatcher("AdminHome.html");
                dispatcher.include(req, resp);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
