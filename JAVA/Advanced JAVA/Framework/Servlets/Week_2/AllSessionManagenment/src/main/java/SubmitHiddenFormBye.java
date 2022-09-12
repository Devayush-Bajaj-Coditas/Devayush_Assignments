import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/SubmitHiddenFormBye")
public class SubmitHiddenFormBye extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/HTML");
        PrintWriter out = resp.getWriter();
        String name  = req.getParameter("username");
        String city = req.getParameter("city");
        out.println(" Hi "+ name + " your city is " + city);
    }
}
