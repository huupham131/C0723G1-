<%--
  Created by IntelliJ IDEA.
  User: macbook
  Date: 10/31/23
  Time: 11:12 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        table {
            font-family: arial, sans-serif;
            border-collapse: collapse;
            width: 100%;
        }

        td, th {
            border: 1px solid #dddddd;
            text-align: left;
            padding: 8px;
        }

        tr:nth-child(even) {
            background-color: #dddddd;
        }
    </style>
</head>
<body>
<h1>Product List</h1>
<p>
    <a href="/product?action=create">
        <button>Create new product</button>
    </a>

</p>
<form action="/product">
    <input hidden="hidden" type="text" name="action" value="findByName">
    <input type="text" name="name"><button>Search</button>
</form>
<table>
    <tr>
        <td>Id</td>
        <td>Name</td>
        <td>Price</td>
        <td>Description</td>
        <td>Manufacturer</td>
        <td>Edit</td>
        <td>Delete</td>
    </tr>
    <c:forEach items='${requestScope["productList"]}' var="product">
        <tr>
            <td>${product.getId()}</td>
            <td><a href="/product?action=view&id=${product.getId()}">${product.getName()}</a></td>
            <td>${product.getPrice()}</td>
            <td>${product.getDescription()}</td>
            <td>${product.getManufacturer()}</td>
            <td><a href="/product?action=edit&id=${product.getId()}">
                <button>Edit</button>
            </a></td>
            <td><a href="/product?action=delete&id=${product.getId()}">
                <button>Delete</button>
            </a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
