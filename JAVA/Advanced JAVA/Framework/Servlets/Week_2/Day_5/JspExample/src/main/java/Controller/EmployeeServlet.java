package Controller;

import Dao.EmployeeDao;
import Model.Employee;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Random;

@WebServlet("/register")
public class EmployeeServlet extends HttpServlet {
    private EmployeeDao employeeDao = new EmployeeDao();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/WEB-INF/views/RegisterJSP.jsp");
        requestDispatcher.forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String firstName = req.getParameter("first_name");
        String lastName = req.getParameter("last_name");
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String address = req.getParameter("address");
        String contactNum = req.getParameter("contact_no");

        Employee employee =new Employee();
        Random random = new Random(1000000);
        int id = random.nextInt(20000);
        employee.setId(id);
        employee.setFirstname(firstName);
        employee.setLastname(lastName);
        employee.setUsername(username);
        employee.setPassword(password);
        employee.setAddress(address);
        employee.setContact(contactNum);

        employeeDao.registerEmployee(employee);

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/WEB-INF/views/EmployeeDetail.jsp");
        requestDispatcher.forward(req,resp);

    }
}
