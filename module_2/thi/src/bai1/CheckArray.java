package bai1;

public class CheckArray {
    public static boolean checkArray(int[] arr) {
        boolean flag = false;
        int temp = arr[1] - arr[0];
        if (temp < 0) {
            return flag;
        }
        for (int i = 1; i < arr.length - 1; i++) {
            if ((arr[i + 1] - arr[i]) != temp) {
                flag = false;
                break;
            } else {
                flag = true;
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        int[] array1 = {0, 2, 4, 6, 8};
        int[] array2 = {4, 2, 0, -2};
        int[] array3 = {-4,-2,0,2};
        System.out.println(checkArray(array1));
        System.out.println(checkArray(array2));
        System.out.println(checkArray(array3));
    }
}
