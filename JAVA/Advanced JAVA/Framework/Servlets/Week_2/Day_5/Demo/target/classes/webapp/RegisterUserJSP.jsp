<html>
<head></head>
<body>
<jsp:userBean id = "registerPage" class = "Model.UserBean"></jsp:userBean>
<jsp:setProperty property = "*" name = "registerPage"/></jsp:setProperty>

<jsp:userBean id = "userDao" class ="Dao.UserDao"><jsp:userBean>
<% userDao.save(registerPage)%>

</body>
</html>