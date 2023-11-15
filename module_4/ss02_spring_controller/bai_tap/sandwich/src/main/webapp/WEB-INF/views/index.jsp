<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1>Sandwich Condiments</h1>
<form action="save">
    <div style="display: flex">
    <p>Lettuce</p>
    <input type="checkbox" name="condiment" value="Lettuce">
    <p>Tomato</p>
    <input type="checkbox" name="condiment" value="Tomato">
    <p>Mustard</p>
    <input type="checkbox" name="condiment" value="Mustard">
    <p>Sprouts</p>
    <input type="checkbox" name="condiment" value="Sprouts">
    </div>
    <hr>
    <button>Save</button>
</form>
</body>
</html>