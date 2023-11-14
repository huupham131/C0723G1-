<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
</head>
<body>
<div class="container">
  <div class="row mb-5"><h1 style="text-align: center">THÊM MỚI</h1></div>
  <div class="row">
    <form method="post" action="/vephat?action=create">
      <div class="mb-3">
        <label for="ten" class="form-label">Tên tài khoản</label>
        <select class="form-select" id="ten" name="tenTaiKhoan" aria-label="Default select example">
          <c:forEach var="taikhoan" items="${danhsachTK}">
          <option value="${taikhoan.getMa()}" >
            ${taikhoan.getTenTaiKhoan()}
          </option>
          </c:forEach>
        </select>
      </div>
      <div class="mb-3">
        <label for="soDKThuNuoi" class="form-label">Số đăng ký thú nuôi</label>
        <select class="form-select" id="soDKThuNuoi" name="soDKThuNuoi" aria-label="Default select example">
          <c:forEach var="taikhoan" items="${danhsachTK}">
            <option value="${taikhoan.getMa()}" >
                ${taikhoan.getSoDKThuNuoi()}
            </option>
          </c:forEach>
        </select>
      </div>

      <div class="mb-3">
        <label for="mota" class="form-label">Mô tả lỗi vi phạm</label>
        <input type="text" class="form-control" name="moTaLoi" id="mota" placeholder="">
      </div>
      <div class="mb-3">
        <label for="gia" class="form-label">Ngày giờ vi phạm</label>
        <input type="number" class="form-control" name="ngayGioVP" id="gia" placeholder="">
      </div>
      <div class="mb-3">
        <label for="formGroupExampleInput2" class="form-label">Số tiền đóng phạt</label>
        <input type="date" class="form-control" name="soTienDongPhat" id="formGroupExampleInput2">
      </div>
      <div class="col-12">
        <button type="submit" class="btn btn-primary">Xác nhận</button>
      </div>
    </form>
  </div>
</div>
</body>
</html>
