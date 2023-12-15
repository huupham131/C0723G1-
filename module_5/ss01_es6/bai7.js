// 7. Sử dụng destructuring để trích xuất các giá trị "name" và "age" từ một mảng chứa các đối tượng "person".
 let array = [
     {name: "Hữu",
     age: 26},
     {name:"Tưởng",
     age: 27}
 ]
let name = array.map(({name}) => name);
let age = array.map(({age}) => age);
console.log(name)
console.log(age)
