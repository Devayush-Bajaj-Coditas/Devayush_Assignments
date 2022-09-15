<html>
<head></head>
<body>
<jsp:useBean id = "registerPage" class = "Model.UserBean"></jsp:useBean>
<jsp:setProperty property = "*" name = "registerPage"></jsp:setProperty>

<jsp:useBean id = "userDao" class ="Dao.UserDao"></jsp:useBean>
<%= registerPage.getName()%>
<%-- userDao.save(registerPage); --%>

</body>
</html>