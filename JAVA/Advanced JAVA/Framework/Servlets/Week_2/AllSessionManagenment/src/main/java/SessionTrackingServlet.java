import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/SessionTrackingServlet")
public class SessionTrackingServlet extends HttpServlet {
    @Override

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        HttpSession httpSession = req.getSession();
        PrintWriter out = resp.getWriter();

        httpSession.setAttribute("username", req.getParameter("uname"));
        httpSession.setAttribute("city", req.getParameter("city"));

        out.println("<form action = 'SessionTrackingBye'> " +
                "<input type = 'Submit' value = 'forward Http session'>" +
                "</form>");

        if(httpSession.isNew()){
            out.println("New session");
        }
        else {
            out.println("Old Session");
        }
    }
}
