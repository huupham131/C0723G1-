const array1 = [5,7,3,8,10];
const array2 = array1.filter((x) =>{
    if(x>5){
        return x;
    }
})
console.log(array2)