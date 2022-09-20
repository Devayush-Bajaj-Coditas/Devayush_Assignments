import DAO.DatabaseDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

@WebServlet("/Manali")
public class Manali extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<h1> MANALI <h1>");
        out.println("Manali is a town in the Indian state of Himachal Pradesh.[2] It is situated in the northern end of the Kullu Valley, formed by the Beas River. The town is located in the Kullu district, approximately 270 kilometres (170 mi) north of the state capital of Shimla and 544 kilometres (338 mi) northeast of the national capital of Delhi. With a population of 8,096 people recorded in the 2011 Indian census Manali is the beginning of an ancient trade route through Lahaul and Ladakh, over the Karakoram Pass and onto Yarkand and Hotan in the Tarim Basin of China. Manali is a popular tourist destination in India and serves as the gateway to the Lahaul and Spiti district as well as the city of Leh in Ladakh.[3]");


        out.print("<img src ='src/main/Media/images/ManaliPhoto.png'>");


        out.print("<video width='320' height='240' controls>" +
                "    <source src='src/main/Media/videos/ManaliVideo.mp4'  type= 'video/mp4' >" +
                "</video>");
        //Getting image from the database
        DatabaseDao databaseDao = new DatabaseDao();
        try {

            //Image
            Statement statement = databaseDao.showImage();
            ResultSet resultSet = statement.executeQuery("select * from travelGuide where id =2");
            String imageSource = resultSet.getString(3);
            out.print("<img src='src/main/Media/images/ManaliPhoto.png'>");
            out.println("<img src="+imageSource+">");

           //video
            out.println("lets look at some adorable scenes");
            String videoSource = resultSet.getString(4);
            out.println("<video width='320' height='240' controls>" +
                    "<source src='"+videoSource+"' type='video/mp4'>" +
                    "</video>");

            //audio
            out.println("And the music of Manali");
            String audioSource = resultSet.getString(5);
            out.println("<audio controls>" +
                    "  <source src='"+audioSource+"' type='audio/ogg'>" +
                    "</audio>");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
