<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: zluigon
  Date: 5/4/23
  Time: 10:55 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="../partials/head.jsp">
        <jsp:param name="title" value="View Ads"/>
    </jsp:include>


</head>
<body>

<jsp:include page="../partials/navbar.jsp"/>

<div class="container">
    <h1>List of Ads:</h1>

    <c:forEach var="ad" items="${ads}">
        <div class="ad">
            <div class="container-fluid">
                <h5>Title: ${ad.title}</h5>
                <h6>User_Id: ${ad.userId}</h6>
                <p>Description: ${ad.description}</p>
            </div>
        </div>
    </c:forEach>
</div>

</body>
</html>
