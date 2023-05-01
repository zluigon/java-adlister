<%@ page import="java.util.Objects" %><%--
  Created by IntelliJ IDEA.
  User: zluigon
  Date: 5/1/23
  Time: 10:12 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
    String username = request.getParameter("username");
    String password = request.getParameter("password");

    if (Objects.equals(username, "admin") && (Objects.equals(password, "password"))) {
        response.sendRedirect("/profile.jsp");
    }
%>

<html>
<head>
    <%-- Dynamic titles --%>
    <jsp:include page="partials/head.jsp">
        <jsp:param name="title" value="Log In"/>
    </jsp:include>
</head>

<body class="overflow-hidden">

<%@include file="partials/navbar.jsp" %>

<form action="login.jsp" method="post">
    <section class="vh-">
        <div class="container py-5 w-50">
            <div class="mb-3">
                <label class="form-label" for="username">Username:</label>
                <input class="form-control" type="text" name="username" id="username" placeholder="Enter Username"/>
            </div>
            <div class="mb-3">
                <label class="form-label" for="password">Password:</label>
                <input class="form-control" type="text" name="password" id="password" placeholder="Enter Password"/>
            </div>
            <div class="row mb-4">
                <div class="col d-flex justify-content-center">
                    <div class="form-check">
                        <input class="form-check-input" type="checkbox" value="" id="remember" checked/>
                        <label class="form-check-label" for="remember"> Remember me </label>
                    </div>
                </div>

                <div class="col">
                    <a href="#">Forgot password?</a>
                </div>
            </div>
            <button class="btn w-100 btn-warning btn-outline-dark" type="submit">Submit</button>
        </div>
    </section>
</form>


</body>
</html>

