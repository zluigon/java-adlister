<%--
  Created by IntelliJ IDEA.
  User: zluigon
  Date: 5/3/23
  Time: 10:50 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="partials/head.jsp">
        <jsp:param name="title" value="Guessing Game"/>
    </jsp:include>
</head>
<body>

<form action="guess" method="post">
    <section>
        <label class="form-control-label" for="guess">Guess a number between 1 - 3
            <input class="form-control" type="text" name="guess" id="guess">
        </label>
        <button class="btn" type="submit">Submit</button>
    </section>
</form>

</body>
</html>
