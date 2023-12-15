const array1 = [5,7,3,8,10];
const map = array1.filter((x) =>{
    if(x>5){
        return x;
    }
})
console.log(map)