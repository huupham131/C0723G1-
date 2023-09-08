package ss3_array_method_java.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class MinArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Nhap kich thuoc mang can tao:");
            int size = sc.nextInt();
            if (size > 0) {
                int[] array = new int[size];
                for (int i = 0; i < array.length; i++) {
                    System.out.print("Nhap phan tu " + (i + 1) + " : ");
                    array[i] = sc.nextInt();
                }
                System.out.println("Mang da tao la: " + Arrays.toString(array));
                int min = array[0];
                for (int i = 1; i < array.length; i++) {
                    if (array[i] < min) {
                        min = array[i];
                    }
                }
                System.out.println("Phan tu co gia tri nho nhat la " + min);
                break;
            } else {
                System.out.println("Nhập sai rùi nhập lại đi");
            }
        }
    }
}
