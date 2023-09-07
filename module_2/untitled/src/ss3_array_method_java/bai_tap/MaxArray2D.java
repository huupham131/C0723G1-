package ss3_array_method_java.bai_tap;

import java.util.Scanner;

public class MaxArray2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Nhap so hang mang 2d: ");
            int row = sc.nextInt();
            System.out.println("Nhap so cot mang 2d");
            int col = sc.nextInt();
            if (row > 0 && col > 0) {
                double[][] array2D = new double[row][col];
                for (int i = 0; i < array2D.length; i++) {
                    for (int j = 0; j < array2D[i].length; j++) {
                        System.out.println("Nhap phan tu [" + i + "][" + j + "]");
                        array2D[i][j] = sc.nextFloat();
                    }
                }
                System.out.println("Mang 2d sau khi nhap la");
                double max = array2D[0][0];
                for (int i = 0; i < array2D.length; i++) {
                    for (int j = 0; j < array2D[i].length; j++) {
                        System.out.print(array2D[i][j] + " ");
                        if (array2D[i][j] > max) {
                            max = array2D[i][j];
                        }
                    }
                    System.out.println();
                }
                System.out.println("Phan tu co gia tri lon nhat:" + max);
            } else {
                System.out.println("Nhập sai rùi nhập lại đi");
            }
        }
    }
}
