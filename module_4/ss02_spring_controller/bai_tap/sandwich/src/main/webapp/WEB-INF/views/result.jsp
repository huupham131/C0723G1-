<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: macbook
  Date: 11/15/23
  Time: 11:28 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <tr>
        <th>Condiment:</th>
    </tr>
    <c:forEach items="${condimentList}" var="condiment">
        <tr>
            <td>${condiment}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
