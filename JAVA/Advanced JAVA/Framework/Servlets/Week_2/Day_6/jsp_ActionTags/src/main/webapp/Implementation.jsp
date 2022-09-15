<html>
<body>
<title></title>



<%@ page import= 'java.time.LocalDate'%>

<%!
int square(int y){
return y*y;
}
%>
<%=
square(10)
%><br>
<%
//Implicit Objects -- there are 9 implicit objects in jsp which is by default provided

//1--> out
out.println("This is out implicit object");

//2--> Request
String name = request.getParameter("name");

//3--> Response
//response.sendRedirect("http://www.google.com");

//4--> Config





    //Date tag
    LocalDate date = LocalDate.now();
    LocalDate yesterday = date.minusDays(1);
    LocalDate tomorrow = date.plusDays(1);

%>

Date :<%= date %> <br>
Yesterday ki Date : <%= yesterday %> <br>
Tomorrows ki Date : <%= tomorrow %>
</body>
</html>
