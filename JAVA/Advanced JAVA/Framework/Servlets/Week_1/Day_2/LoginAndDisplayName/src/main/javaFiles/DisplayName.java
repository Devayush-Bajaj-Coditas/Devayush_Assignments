import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class DisplayName extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        PrintWriter out = resp.getWriter();
resp.setContentType("text/HTML");
String name = req.getParameter("uname");
String pass = req.getParameter("password");
out.println("Welcome " + name);

out.println("<a href = 'ByeServlet' target = '_blank' > Bye</a>");

    }
}
