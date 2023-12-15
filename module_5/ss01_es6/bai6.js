// 6. Sử dụng destructuring với rest parameter để trích xuất phần tử đầu tiên vào biến
// "first" và các phần tử còn lại vào một mảng mới "rest".
const array = [4,3,6,8,9,6,4];
const [first,second,... rest] = array
console.log(first)
console.log(second)
console.log(rest)