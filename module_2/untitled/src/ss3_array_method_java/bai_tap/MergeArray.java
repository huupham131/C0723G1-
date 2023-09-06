package ss3_array_method_java.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao kich thuoc mang 1: ");
        int size1 = sc.nextInt();
        int[] array1 = new int[size1];
        for (int i = 0; i < array1.length; i++) {
            System.out.print("Nhap phan tu " + (i + 1) + " : ");
            array1[i] = sc.nextInt();
        }
        System.out.println("Mang 1 la " + Arrays.toString(array1));
        System.out.println("Nhap vao kich thuoc mang 2: ");
        int size2 = sc.nextInt();
        int[] array2 = new int[size2];
        for (int i = 0; i < array2.length; i++) {
            System.out.print("Nhap phan tu " + (i + 1) + " : ");
            array2[i] = sc.nextInt();
        }
        System.out.println("Mang 2 la " + Arrays.toString(array2));
        int[] array3 = new int[array1.length + array2.length];
        for (int i = 0; i < array1.length; i++) {
            array3[i] = array1[i];
        }
        for (int i = 0; i < array2.length; i++) {
            array3[array1.length + i] = array2[i];
        }
        System.out.println("Mang 3 la " + Arrays.toString(array3));
    }
}
