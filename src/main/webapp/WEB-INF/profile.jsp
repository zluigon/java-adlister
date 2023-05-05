<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="../partials/head.jsp">
        <jsp:param name="title" value="Your Profile"/>
    </jsp:include>
</head>
<body>
<jsp:include page="../partials/navbar.jsp"/>

<div class="container">
    <h2>Welcome, ${sessionScope.user}.</h2>
    <h4>Viewing your profile.</h4>
</div>


<form action="logout" method="post">
    <button type="submit">Logout</button>
</form>
</body>
</html>
