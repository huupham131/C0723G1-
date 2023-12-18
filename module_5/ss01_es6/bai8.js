// 8. Sử dụng Rest parameter và Spread operator để tạo một hàm nhận vào danh sách các số và trả về tổng của chúng.
let sum = (...arg) =>arg.reduce((x, y) => x + y);
console.log(sum(1,2,4,5,7))
