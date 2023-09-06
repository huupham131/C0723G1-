package ss3_array_method_java.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class MinArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap kich thuoc mang can tao:");
        int size = sc.nextInt();
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
    }
}
