package Test;

public class Test {
    boolean solution(int[] a) {
        int sum1= 0;
        int sum2 = 0;
        if(a.length==0){
            return false;
        }
        for(int i =1; i<a.length-1; i++){
            for(int j=0; j<i; j++){
                sum1 += a[j];
            }
            for(int z=a.length-1; z>i; z--){
                sum2+=a[z];
            }
        }
        if(sum1==sum2){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Test test = new Test();

    }
}
