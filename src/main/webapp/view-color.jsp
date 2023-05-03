<%--
  Created by IntelliJ IDEA.
  User: zluigon
  Date: 5/2/23
  Time: 2:41 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="partials/head.jsp">
        <jsp:param name="title" value="View Color"/>
    </jsp:include>

</head>
<body style="background-color:${color}">
    <div>
        <h1>The current background color is: ${color}</h1>
    </div>
</body>
</html>
