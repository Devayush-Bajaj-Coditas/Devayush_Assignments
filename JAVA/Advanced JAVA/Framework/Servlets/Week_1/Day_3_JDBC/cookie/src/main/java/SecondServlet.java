

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/SecondServlet")
public class SecondServlet extends HttpServlet {

        public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

                response.setContentType("text/html");

                PrintWriter out = response.getWriter();

                Cookie ck[] = request.getCookies();

                out.print("Hello " + ck[0].getValue());

                out.close();

        }
}