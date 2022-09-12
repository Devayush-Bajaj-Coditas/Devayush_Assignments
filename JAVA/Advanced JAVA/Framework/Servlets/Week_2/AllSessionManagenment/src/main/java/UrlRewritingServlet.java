
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
@WebServlet("/UrlRewritingServlet")
public class UrlRewritingServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws  IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<a href='UrlRewritingServletBye?uname="+req.getParameter("uname")+"&city="+req.getParameter("city") +
                "> Forward url Rewriting </a>");

    }
}
