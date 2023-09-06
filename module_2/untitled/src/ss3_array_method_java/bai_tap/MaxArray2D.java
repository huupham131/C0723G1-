package ss3_array_method_java.bai_tap;

import java.util.Scanner;

public class MaxArray2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so hang mang 2d: ");
        int row = sc.nextInt();
        System.out.println("Nhap so cot mang 2d");
        int col = sc.nextInt();
        double[][] matrix = new double[row][col];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println("Nhap phan tu [" + i + "][" + j + "]");
                matrix[i][j] = sc.nextFloat();
            }
        }
        System.out.println("Ma tran sau khi nhap la");
        double max = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
            System.out.println();
        }
        System.out.println("Phan tu co gia tri lon nhat:" + max);
    }
}
