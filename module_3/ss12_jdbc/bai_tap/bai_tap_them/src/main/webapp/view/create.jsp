
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
    <form method="post">
      <div class="mb-3">
        <label for="mahh" class="form-label">Mã hàng hoá</label>
        <input type="text" class="form-control" name="ma" id="mahh" placeholder="">
      </div>
      <div class="mb-3">
        <label for="ten" class="form-label">Tên</label>
        <input type="text" class="form-control" name="ten" id="ten" placeholder="">
      </div>
      <div class="mb-3">
        <label for="dvt" class="form-label">dvt</label>
        <input type="text" class="form-control" name="dvt" id="dvt" placeholder="">
      </div>
      <div class="mb-3">
        <label for="gia" class="form-label">Giá</label>
        <input type="number" class="form-control" name="gia" id="gia" placeholder="">
      </div>
      <div class="mb-3">
        <label for="formGroupExampleInput2" class="form-label">Ngày thu hoạch</label>
        <input type="date" class="form-control" name="ngayTH" id="formGroupExampleInput2">
      </div>
      <div class="mb-3">
        <label class="mb-2" for="drop-down">Chọn loại hàng hoá</label>
        <select class="form-select" name="loaihang" aria-label="Default select example" id="drop-down">
          <option value="" >
          </option>
        </select>
      </div>
      <div class="col-12">
        <button type="submit" class="btn btn-primary">Xác nhận</button>
      </div>
    </form>
  </div>
</div>
</body>
</html>
