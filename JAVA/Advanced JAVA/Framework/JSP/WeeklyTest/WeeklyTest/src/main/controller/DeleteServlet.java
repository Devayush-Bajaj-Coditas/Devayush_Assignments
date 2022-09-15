package controller;

import dao.RegisterDao;

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

@WebServlet("/DeleteServlet")
public class DeleteServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        RegisterDao registerDao = new RegisterDao();
        PrintWriter out = resp.getWriter();
        String DeleteUSerName = req.getParameter("DeleteUsername");
        try {
            int status = registerDao.delete(DeleteUSerName);

            if(status> 0 ){
                out.println("Successfully Deleted");
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
