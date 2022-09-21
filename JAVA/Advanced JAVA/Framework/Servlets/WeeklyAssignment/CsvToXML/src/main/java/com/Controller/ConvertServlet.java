package com.Controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.*;
import java.nio.Buffer;

@WebServlet("/ConvertServlet")
@MultipartConfig( fileSizeThreshold=1024*1024,
        maxFileSize=1024*1024*5, maxRequestSize=1024*1024*5*5)
public class ConvertServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       resp.setContentType("Text/html");
        PrintWriter out = resp.getWriter();
        //Receiving file from HTML page and storing it into Files folder in project
        Part inputFile =req.getPart("inputFileHTML");
        String filename = inputFile.getSubmittedFileName();
        if((filename.substring(filename.indexOf("."), filename.length())).equalsIgnoreCase("CSV")) {
            InputStream inputStream = inputFile.getInputStream();

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));

            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("OutputFile.xlsx"));

            String line = "";

            String token = "";

            while ((line = bufferedReader.readLine()) != null) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
            bufferedReader.close();
            bufferedWriter.close();
//
//            for(Part part: req.getParts()) {
//                part.write("C:\\Users\\coditas\\Desktop\\Devayush_Assignments\\JAVA\\Advanced JAVA\\Framework\\Servlets\\WeeklyAssignment\\CsvToXML\\src\\main\\Files\\" + filename);
//            }
//
//            //Reading CSV file
//            String line ="";
//            String deleimeter = ",";
//            BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\coditas\\Desktop\\Devayush_Assignments\\JAVA\\Advanced JAVA\\Framework\\Servlets\\WeeklyAssignment\\CsvToXML\\src\\main\\Files\\"+ filename));
//            line = bufferedReader.readLine();
//            while((line = bufferedReader.readLine()) != null){
//                String [] fileData = line.split(deleimeter);
//            }
//
//            //Giving output file
//            FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\coditas\\Desktop\\Devayush_Assignments\\JAVA\\Advanced JAVA\\Framework\\Servlets\\WeeklyAssignment\\CsvToXML\\src\\main\\Files\\OutputFile.xlsx",true);
//        }
//        else {
//
        }
//
    }
}
