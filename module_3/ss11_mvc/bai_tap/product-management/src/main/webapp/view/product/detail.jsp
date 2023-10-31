<%--
  Created by IntelliJ IDEA.
  User: macbook
  Date: 10/31/23
  Time: 11:13 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Product details</h1>
<p>
    <a href="/product">Back to product list</a>
</p>
<table>
    <tr>
        <td>ID: </td>
        <td>${requestScope["product"].getId()}</td>
    </tr>
    <tr>
        <td>Name: </td>
        <td>${requestScope["product"].getName()}</td>
    </tr>
    <tr>
        <td>Price: </td>
        <td>${requestScope["product"].getPrice()}</td>
    </tr>
    <tr>
        <td>Description: </td>
        <td>${requestScope["product"].getDescription()}</td>
    </tr>
    <tr>
        <td>Manufacturer: </td>
        <td>${requestScope["product"].getManufacturer()}</td>
    </tr>
</table>
</body>
</html>
