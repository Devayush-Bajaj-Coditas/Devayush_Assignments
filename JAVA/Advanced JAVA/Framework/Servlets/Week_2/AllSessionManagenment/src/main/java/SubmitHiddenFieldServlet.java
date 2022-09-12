import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.text.html.HTMLEditorKit;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/SubmitHiddenFieldServlet")
public class SubmitHiddenFieldServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        String name = req.getParameter("uname");
        String city = req.getParameter("city");
        out.println("<form action = 'SubmitHiddenFormBye' method = 'post'><input type = 'hidden' name = 'username' value = '"+ name +"'>");
        out.println("<input type = 'hidden' name = 'city' value = '"+ city +"'> " +
                "<input type = 'submit' value = 'send Hidden form' ></form>");
    }
}
