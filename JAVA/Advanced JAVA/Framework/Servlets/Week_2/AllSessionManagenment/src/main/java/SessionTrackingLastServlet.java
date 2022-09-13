import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/SessionTrackingLastServlet")
public class SessionTrackingLastServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        HttpSession httpSession = req.getSession(true);
        PrintWriter out = resp.getWriter();
        out.println("Hi " + httpSession.getAttribute("username") + " your city is " + httpSession.getAttribute("city"));

        if(httpSession.isNew()){
            out.println("New session");
        }
        else {
            out.println("Old Session");
        }

    }

}
