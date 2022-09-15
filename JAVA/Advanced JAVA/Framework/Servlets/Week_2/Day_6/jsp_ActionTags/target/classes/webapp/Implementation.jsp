<html>
<body>
<title></title>
<%@ page import= 'java.time.LocalDate'%>
<%

    LocalDate date = LocalDate.now();
    LocalDate yesterday = date.minusDays(1);
    LocalDate tomorrow = date.plusDays(1);

%>

Date :<%= date %>
Yesterday ki Date : <%= yesterday %>
Tomorrows ki Date : <%= tomorrow %>
</body>
</html>
