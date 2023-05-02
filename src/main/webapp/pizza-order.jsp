<%--
  Created by IntelliJ IDEA.
  User: zluigon
  Date: 5/2/23
  Time: 12:31 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="partials/head.jsp">
        <jsp:param name="title" value="Pizza World"/>
    </jsp:include>
</head>
<body>

<h1>Welcome to Pizza World</h1>

<form action="pizza-order" method="post">
    <section>

        <h3>Size:</h3>
        <select class="form-select" size="3" name="size" id="size">
            <option value="small">Small</option>
            <option value="medium">Medium</option>
            <option value="large">Large</option>
        </select>

        <h3>Crust:</h3>
        <select class="form-select" size="3" name="crust" id="crust">
            <option value="thin-crust">Thin Crust</option>
            <option value="hand-tossed">Hand Tossed</option>
            <option value="deep-dish">Deep Dish</option>
        </select>

        <h3>Sauce:</h3>
        <select class="form-select" size="3" name="sauce" id="sauce">
            <option value="marinara">Marinara</option>
            <option value="pesto">Pesto</option>
            <option value="bbq">BBQ</option>
        </select>

        <h3>Toppings:</h3>
        <div>
            <input class="form-check" type="checkbox" value="pepperoni" id="pepperoni" name="toppings">
            <label class="form-check-label" for="pepperoni">Pepperoni</label>
        </div>
        <div>
            <input class="form-check" type="checkbox" value="sausage" id="sausage" name="toppings">
            <label class="form-check-label" for="sausage">Sausage</label>
        </div>
        <div>
            <input class="form-check" type="checkbox" value="supreme" id="supreme" name="toppings">
            <label class="form-check-label" for="supreme">Supreme</label>
        </div>

        <h3>Delivery Address:</h3>
        <input class="form-control" type="text" name="address" id="address" placeholder="Enter Address">

        <button class="btn" type="submit">Submit</button>

    </section>
</form>

</body>
</html>
