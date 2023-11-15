<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1>Calculator</h1>
<form action="cal">
    <input name="num1" type="number" step="0.01" placeholder="Enter first number" value="${num1}">
    <input name="num2" type="number" step="0.01" placeholder="Enter second number" value="${num2}">
    <br>
    <button name="cal" value="Addition">Addition(+)</button>
    <button name="cal" value="Subtraction">Subtraction(-)</button>
    <button name="cal" value="Multiplication">Multiplication(*)</button>
    <button name="cal" value="Division">Division(/)</button>
</form>
<p>Result ${cal} : <c:if test="${mess==''}">${result}</c:if> ${mess}</p>
</body>
</html>