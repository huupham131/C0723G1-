<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: macbook
  Date: 11/16/23
  Time: 11:02 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form:form modelAttribute="mailbox" action="mailbox/update" method="post">
    <table>
        <tr>
            <th>Language</th>
            <td>
                <form:select path="language" >
                    <form:options items="${languageList}"/>
                </form:select>
            </td>
        </tr>
        <tr>
            <th>Page Size:</th>
            <td>Show
                <form:select path="pageSize">
                    <form:options items="${pageSizeList}"/>
                </form:select>
                email per page
            </td>
        </tr>
        <tr>
            <th>Spams filter:</th>
            <td><form:checkbox path="spamsFilter" value="${mailbox.spamsFilter}"/>Enable spams filter</td>
        </tr>
        <tr>
            <th>Signature</th>
            <td><form:textarea path="signature"/></td>
        </tr>
        <tr>
            <th></th>
            <td>
                <form:button>Update</form:button>
            </td>
        </tr>
    </table>
</form:form>
</body>
</html>
