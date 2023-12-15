// 5. Tìm phần tử đầu tiên trong mảng lớn hơn 3.
const array = [-1,2,6,3,6];
const findElement = array.find((x) => x >3);
if (findElement === undefined){
    console.log("Không tìm thấy phần tử nào lớn hơn 3")
}else {
    console.log(`Phần tử đầu tiên lớn hơn 3 là  ${findElement}`)
}