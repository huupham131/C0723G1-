package ss13_searching_algorithms.bai_tap.bai2;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        int[] array;
        int number;
        int indexOfNumber;
        while (true) {
            System.out.println("Nhap kich thuoc mang can tao:");
            size = sc.nextInt();
            if (size > 0) {
                array = new int[size];
                for (int i = 0; i < array.length; i++) {
                    System.out.print("Nhap phan tu " + (i + 1) + " : ");
                    array[i] = sc.nextInt();
                }
                System.out.println("Mang da tao la: " + Arrays.toString(array));
                Arrays.sort(array);
                System.out.println("Mang sau khi sap xep" + Arrays.toString(array));
                System.out.println("Nhap so can tim:");
                number = sc.nextInt();
                indexOfNumber = binarySearch(array, 0, array.length - 1, number);
                System.out.println("So can tim o vi tri :" + indexOfNumber);
                break;
            } else {
                System.out.println("Nhập sai rùi nhập lại đi");
            }
        }

    }

    public static int binarySearch(int[] array, int left, int right, int value) {
        int middle;
        while (left <= right) {

            middle = (left + right) / 2;
            if (array[middle] == value) {
                return middle;
            }
            if (array[middle] < value) {
                left = middle + 1;
                return binarySearch(array, left, right, value);
            } else {
                right = middle - 1;
                return binarySearch(array, left, right, value);
            }
        }
        return -1;
    }
}

