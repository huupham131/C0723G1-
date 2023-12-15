// 4. Kiểm tra 1 mảng tất cả các phần tử trong mảng đó có lớn hơn 0 hay không? (every).
const array = [-1,2,6,3,6];
const check = array.every((x) => x >0)
if(check){
    console.log("Tất cả phần tử đều lớn hơn 0")
}else {
    console.log("Mảng Có phần tử bé hơn 0")
}
