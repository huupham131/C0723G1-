package ss3_array_method_java.bai_tap;

import java.util.Scanner;

public class SumDiagonalLine2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap kich thuoc canh mang vuong 2d: ");
        int row = sc.nextInt();
        int col = row;
        int[][] array2D = new int[row][col];
        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D[i].length; j++) {
                System.out.println("Nhap phan tu [" + i + "][" + j + "]");
                array2D[i][j] = sc.nextInt();
            }
        }
        System.out.println("Mang 2d sau khi nhap la");
        int sum = 0;
        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D[i].length; j++) {
                if (i == j) {
                    sum += array2D[i][j];
                }
                System.out.print(array2D[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Tong cua duong cheo la: " + sum);
    }
}
