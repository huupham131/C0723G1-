<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: macbook
  Date: 10/30/23
  Time: 10:52 AM
  To change this template use File | Settings | File Templates.
--%>
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
<h1>Danh sách khách hàng</h1>
<table >
    <tr>
        <th>Tên</th>
        <th>Ngày sinh</th>
        <th>Địa chỉ</th>
        <th>Hình ảnh</th>
    </tr>
<c:forEach var="customer" items="${customerList}">
<tr>
    <td>${customer.name}</td>
    <td>${customer.birthday}</td>
    <td>${customer.address}</td>
    <td><img src="${customer.imagePath}" style="width: 50px; height: 50px">
    </td>
</tr>
</c:forEach>

</table>
</body>
</html>
