// 3. Kiểm tra 1 mảng có chứa số V hay không nếu có trả về V không thì trả về "không tìm thấy" (some).
const array = [5,36,7,26,3,2]
const V= 1;
const containV = array.some((x)=> x === V)
if(containV){
    console.log(V)
}else{
    console.log("Không tìm thấy" + V)
}