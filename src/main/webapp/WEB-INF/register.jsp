<%--
  Created by IntelliJ IDEA.
  User: zluigon
  Date: 5/8/23
  Time: 2:33 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="partials/head.jsp">
        <jsp:param name="title" value="Register"/>
    </jsp:include>
</head>
<body>

<jsp:include page="partials/navbar.jsp"/>
<div class="container">
    <h1>Register</h1>
    <form action="register" method="post">
        <div class="form-group">
            <label for="username" class="form-control-label">Enter Username:</label><input type="text" name="username" id="username" class="form-control">
        </div>
        <div class="form-group">
            <label for="email" class="form-control-label">Enter Email:</label><input type="text" name="email" id="email" class="form-control">
        </div>
        <div class="form-group">
            <label for="password" class="form-control-label">Enter Password:</label><input type="text" name="password" id="password" class="form-control">
        </div>
        <button class="btn" type="submit">Submit</button>
    </form>
</div>

</body>
</html>
