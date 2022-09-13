import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/submitCookie")
public class CookieServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        resp.setContentType("text/html");
        Cookie cookie = new Cookie("uname",req.getParameter("uname"));
        Cookie cookie2 = new Cookie("city",req.getParameter("city"));
        resp.addCookie(cookie);
        resp.addCookie(cookie2);
        out.println("<form action = 'CookieBye'>" +
                "<input type = 'Submit' value = 'Forward Cookie'>" +
                "</form>");
        out.close();

    }
}
