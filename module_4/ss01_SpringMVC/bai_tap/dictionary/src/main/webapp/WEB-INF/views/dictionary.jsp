<%--
  Created by IntelliJ IDEA.
  User: macbook
  Date: 11/14/23
  Time: 11:43 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Ứng dụng từ điển</title>
</head>
<body>
<h1>Ứng dụng từ điển</h1>
<form method="post">
    <label for="eng">Nhập từ tiếng anh</label>
    <br/>
    <input name="eng" id="eng" value="${eng}">
    <button>Tìm kiếm</button>
</form>
<p>Kết quả: ${result}</p>
</body>
</html>
