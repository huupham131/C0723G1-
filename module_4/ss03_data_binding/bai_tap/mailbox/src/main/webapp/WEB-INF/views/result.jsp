<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: macbook
  Date: 11/16/23
  Time: 11:45 AM
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
        ${mess}
    </tr>
    <tr>
        <th>Language</th>
        <td>
            ${mailbox.language}
        </td>
    </tr>
    <tr>
        <th>Page Size:</th>
        <td>Show
            ${mailbox.pageSize}
            email per page
        </td>
    </tr>
    <tr>
        <th>Spams filter:</th>
        <td>
            <c:if test="${mailbox.spamsFilter==true}">
            <input checked type="checkbox" disabled>
            </c:if>
        <td><c:if test="${mailbox.spamsFilter==false}">
            <input type="checkbox" disabled></c:if></td>
    </tr>
    <tr>
        <th>Signature</th>
        <td><textarea>${mailbox.signature}</textarea></td>
    </tr>
</table>
</body>
</html>
