
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Bootstrap demo</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
</head>
<body>
<!--NAVBAR-->
<nav class="navbar navbar-expand-lg bg-body-tertiary" style="margin:20px 10px 50px">
    <div class="container-fluid">
        <a class="navbar-brand" href="#">Navbar</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="#">Trang chủ</a>
                </li>
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                        Sắp xếp
                    </a>
                    <ul class="dropdown-menu">
                        <li><a class="dropdown-item" href="#">Sắp xếp kiểu 1</a></li>
                        <li><a class="dropdown-item" href="#">Sắp xếp kiểu 2</a></li>
                    </ul>
                </li>
            </ul>
            <form class="d-flex" role="search">
                <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
                <button class="btn btn-outline-success" type="submit">Tìm</button>
            </form>
        </div>
    </div>
</nav>
<!--TABLE-->
<div class="container">
    <div class="row" style="margin-bottom: 20px">
        <a href="/vephat?action=create"><button class="btn btn-success"> Thêm mới vé phạt</button></a>
        <table class="table table-hover table-responsive">
            <thead class="thead-inverse">
            <tr>
                <th>Mã Vé Phạt</th>
                <th>Tên tài khoản</th>
                <th>Số DK thú nuôi</th>
                <th>Lỗi vi phạm</th>
                <th>Ngày giờ vi phạm</th>
                <th>Số tiền phạt</th>
                <th colspan="3"  style="text-align: center">Chức năng</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach var="vephat" items="${danhsachve}">
            <tr>

                <td>${vephat.getMaVePhat()}</td>
                <td>${vephat.getTenTaiKhoan()}</td>
                <td>${vephat.getSoDKThuNuoi()}</td>
                <td>${vephat.getMoTaViPham()}</td>
                <td>${vephat.getNgayGioViPham()}</td>
                <td>${vephat.getSoTienDongPhat()}</td>

                <td  style="text-align: center">
                    <div class="btn-group" role="group" aria-label="Basic mixed styles example">
                        <c:if test="${vephat.getSoTienDongPhat()!='Đã đóng phạt'}">
                            <button type="button" class="btn btn-danger"
                                    data-bs-toggle="modal" data-bs-target="#exampleModal" >Đóng Phạt</button>
                        </c:if>
                      <c:if test="${vephat.getSoTienDongPhat()=='Đã đóng phạt'}">
                        <button type="button" class="btn btn-danger"
                                data-bs-toggle="modal" data-bs-target="#exampleModal" onclick="modalDel()">Xóa</button>
                      </c:if>
                    </div>
                </td>
            </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
    <div class="row" style="text-align: center">
        <div>
            <a>Previous</a>
            <span>1</span> / <span>5</span>
            <a>Next</a>
        </div>
    </div>
</div>
<!--MODAL-->
<div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <form action="/">
                <input name="action" value="delete" hidden="hidden">
                <input name="iddelete" id="iddelete" hidden="hidden">

            <div class="modal-header">
                <h1 class="modal-title fs-5" id="exampleModalLabel">Chắc chưa?</h1>
                <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
            </div>
            <div class="modal-body">
                Bạn chắc chắn muốn xóa đối tượng<span id="nameDel"></span> này chứ?
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Chưa chắc</button>
                <button class="btn btn-danger" >Chắc</button>
            </div>
            </form>
        </div>
    </div>
</div>
<script>

</script>
</body>
</html>