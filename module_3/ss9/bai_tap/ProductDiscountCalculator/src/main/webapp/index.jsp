<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<form action="/cal" method="get">
    <p>Enter product description</p><input name="description">
    <br>
    <p>Enter price</p><input name="price" type="number" step="0.01">
    <br>
    <p>Enter discount percent</p><input name="discountPercent" type="number" step="0.01">
    <br>
    <button type="submit">Calculate Discount</button>
</form>
</body>
</html>