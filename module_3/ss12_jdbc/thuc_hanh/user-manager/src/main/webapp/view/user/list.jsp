<%--
  Created by IntelliJ IDEA.
  User: macbook
  Date: 10/31/23
  Time: 9:50 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>User Management Application</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL"
            crossorigin="anonymous"></script>
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
<center>
    <h1>User Management</h1>
</center>
<div>
    <p><a href="/users?action=create">Add New User</a></p>
    <form action="/users">
        <input hidden="hidden" type="text" name="action" value="search">
        <input type="text" name="country">
        <button>Search by country</button>
    </form>
    <a href="/users">
        <button>Order by ID</button>
    </a>
    <table>
        <tr>
            <th>ID</th>
            <th><a href="/users?action=order"> <button>Name</button></a></th>
            <th>Email</th>
            <th>Country</th>
            <th>Actions</th>
        </tr>
        <c:forEach var="user" items="${listUser}">
            <tr>
                <td><c:out value="${user.getId()}"/></td>
                <td><c:out value="${user.getName()}"/></td>
                <td><c:out value="${user.getEmail()}"/></td>
                <td><c:out value="${user.getCountry()}"/></td>
                <td>
                    <a href="/users?action=edit&id=${user.id}">
                        <button>Edit</button>
                    </a>
                    <!-- Button trigger modal -->
                    <button type="button" class="btn btn-primary" data-bs-toggle="modal" data-bs-target="#exampleModal" onclick="modalDelete(${user.id})">
                        Delete
                    </button>
                </td>
            </tr>
        </c:forEach>
    </table>
    <div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <h5 class="modal-title" id="exampleModalLabel">You sure</h5>
                    <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                </div>
                <div class="modal-body">
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close</button>
<%--                    <button type="button" class="btn btn-primary">Save changes</button>--%>
                    <a id="test" class="btn btn-primary">Save</a>
                </div>
            </div>
        </div>
    </div>
</div>
<script>
    function modalDelete(id) {
        console.log(id)
        document.getElementById("test").setAttribute("href",`/users?action=delete&id=` + id);
    }
</script>
</body>
</html>
