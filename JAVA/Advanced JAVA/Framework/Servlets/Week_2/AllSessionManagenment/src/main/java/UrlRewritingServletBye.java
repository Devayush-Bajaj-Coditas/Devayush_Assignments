import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/UrlRewritingServletBye")
public class UrlRewritingServletBye extends HttpServlet {
    static int number = 4;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/HTML");

        HttpSession session = req.getSession();

        if(number == 1) {
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("RequestDispatcher");
            requestDispatcher.forward(req, resp);
        }

        number--;
        resp.setIntHeader("refresh", 1);

        PrintWriter out = resp.getWriter();
        out.println("Hi "+ req.getParameter("uname")+" your city is " + req.getParameter("city"));

        out.println("Sending request redirect in " + number + " second");
    }
}
