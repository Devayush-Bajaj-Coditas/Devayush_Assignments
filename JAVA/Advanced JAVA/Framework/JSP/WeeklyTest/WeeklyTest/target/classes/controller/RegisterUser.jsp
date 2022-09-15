<html>
<head></head>
<body>
<jsp:useBean id = "user" class = "model.UserBean"></jsp:useBean>
<jsp:setProperty property = "*" name = "user"></jsp:setProperty>

<%= user.getUsername()%>
<%-- userDao.save(registerPage); --%>

</body>
</html>