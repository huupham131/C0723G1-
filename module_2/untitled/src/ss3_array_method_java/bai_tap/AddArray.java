package ss3_array_method_java.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class AddArray {
    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4, 5, 0, 0, 0};
        System.out.println(Arrays.toString(array));
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập phần tử muốn chèn: ");
        int X = sc.nextInt();
        System.out.println("Nhập vị trí muốn chèn: ");
        int index = sc.nextInt();
        if (index <= -1 || index > (array.length - 1)) {
            System.out.println("Ko chen dc");
        } else {
            for (int i = 0; i < array.length; i++) {
                if (i == index) {
                    for (int j = array.length - 1; j >= index; j--) {
                        array[j] = array[j - 1];
                    }
                    array[i] = X;
                }
            }
            System.out.println("Mang sau khi chen: " + Arrays.toString(array));
        }
    }
}
