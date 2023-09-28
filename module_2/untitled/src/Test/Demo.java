package Test;

public class Demo {
    public static void main(String[] args) {

    }
    int[] solution(int[] a) {
        int minIndex;
        for (int i = 0; i < a.length - 1; i++) {
            if(a[i]!=-1){
                minIndex = i;
            }else {
                continue;
            }
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[minIndex] && a[j]!=-1) {
                    minIndex = j;
                }
            }
            int temp = a[minIndex];
            a[minIndex] = a[i];
            a[i] = temp;
        }
        return a;
    }


}
