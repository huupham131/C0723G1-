// 7. Sử dụng destructuring để trích xuất các giá trị "name" và "age" từ một mảng chứa các đối tượng "person".
 let array = [
     {name: "Hữu",
     age: 26},
     {name:"Tưởng",
     age: 27}
 ]
for (const { name, age } of array) {
    console.log(`Name: ${name}, Age: ${age}`);
}
