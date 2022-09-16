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

@WebServlet("/UpdateServlet")
public class UpdateServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        String updateThis = req.getParameter("updateThis");
        String data = req.getParameter("newData");
        String username = req.getParameter("username");

        UserBean bean = new UserBean();
        bean.setUpdateThis(updateThis);
        bean.setNewData(data);
        bean.setUsername(username);

        RegisterDao dao = new RegisterDao();
        try {
            int status = dao.update(bean);
            if(status > 0) {
                out.println("updated successfully");
                RequestDispatcher requestDispatcher = req.getRequestDispatcher("AdminHome.html");
                requestDispatcher.include(req,resp);
            }
            else{
                out.println("something went wrong");
                RequestDispatcher requestDispatcher = req.getRequestDispatcher("AdminHome.html");
                requestDispatcher.include(req,resp);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
