<%--
  Created by IntelliJ IDEA.
  User: macbook
  Date: 11/14/23
  Time: 11:06 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Ứng dụng chuyển đổi tiền tệ</title>
</head>
<body>
<form method="post">
  <label for="usd"> Nhập USD:</label>
  <input name="usd" type="number" id="usd" step="0.01">
  <button>Chuyển đổi</button>
</form>
<p>Kết quả : ${result} </p>
</body>
</html>
