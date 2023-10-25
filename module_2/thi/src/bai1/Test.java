package bai1;

public class Test {
    public static void main(String[] args) {
    }
   public static int[] solution(int[][] arr) {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j]<=1){
                    continue;
                }
                for (int z = 2; z <= arr[i][j]/2; z++) {
                    if(arr[i][j]%z==0){
                        break;
                    }
                    s.append(arr[i][j]);
                }
            }
        }
        String[] a = s.toString().split(",");
        int[] b = new int[a.length];
        for (int j = 0; j < a.length; j++) {
            b[j]=Integer.parseInt(a[j]);
        }
        for (int j = 0; j < b.length; j++) {
            for (int j2 = 0; j2 < b.length; j2++) {
                if(b[j2]<b[j]){
                    int t = b[j];
                    b[j]=b[j2];
                    b[j2]=t;
                }
            }
        }
        return b;
    }

}
