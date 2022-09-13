package JavaFiles;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class RegisterServlet extends HttpServlet {
    Employee employee = new Employee();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       String name =  req.getParameter("name");
       String email = req.getParameter("email");
       String mobileNo = req.getParameter("mobile_no");
       String password = req.getParameter("password");

       employee.setName(name);
       employee.setEmail(email);
       employee.setPassword(password);
       employee.setMobileNo(mobileNo);

    }
}
