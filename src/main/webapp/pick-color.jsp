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
        <jsp:param name="title" value="Pick Color"/>
    </jsp:include>
</head>
<body>
<form action="viewcolor" method="post">
    <section>
        <label class="form-control-label" for="color"> Enter your favorite color:
            <input class="form-control" type="text" name="color" id="color">
        </label>
        <button class="btn" type="submit">Submit</button>
    </section>
</form>

</body>
</html>
