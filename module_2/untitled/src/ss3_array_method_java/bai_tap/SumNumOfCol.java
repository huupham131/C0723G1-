package ss3_array_method_java.bai_tap;

import java.util.Scanner;

public class SumNumOfCol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so hang mang 2d: ");
        int row = sc.nextInt();
        System.out.println("Nhap so cot mang 2d");
        int col = sc.nextInt();
        int[][] matrix = new int[row][col];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println("Nhap phan tu [" + i + "][" + j + "]");
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Ma tran sau khi nhap la");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Nhap cot muon tinh tong:");
        int total = 0;
        int input = sc.nextInt();
        for (int j = (input - 1); j < matrix[0].length; j++) {
            for (int i = 0; i < matrix.length; i++) {
                total += matrix[(i)][input - 1];
            }
        }
        System.out.println("Sum for column " + input + " is " + total);
    }
}
