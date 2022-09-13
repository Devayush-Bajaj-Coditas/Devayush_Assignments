

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

     @WebServlet("/FirstServlet")
    public class FirstServlet extends HttpServlet

    {
        public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
            response.setContentType("text/html");

            PrintWriter out = response.getWriter();

            String n=request.getParameter("userName");

            out.print("Welcome "+n);  // This is reply to the client

            Cookie ck  =new Cookie("uname", n);// [name,value]

            response.addCookie(ck);//adding cookie in the response

            out.print("<form action='SecondServlet' method ='get'>");

            out.print("<input type='submit' value='go'>");

            out.print("</form>");

            out.close();
        }
}
