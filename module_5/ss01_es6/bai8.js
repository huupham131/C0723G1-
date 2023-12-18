// 8. Sử dụng Rest parameter và Spread operator để tạo một hàm nhận vào danh sách các số và trả về tổng của chúng.
let value = (...arg) =>arg.reduce((total, element) => total + element);
console.log(value(1,2,4,5,7))
