package ss2_loop_java.bai_tap;

import java.util.Scanner;

public class DisplayPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong so nguyen to can in ra:");
        int quantity = sc.nextInt();
        int count = 0;
        int number = 2;
        while (count < quantity) {
            int i = 2;
            boolean check = true;
            while (i < number) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if (check) {
                System.out.println(number);
                count++;
            }
            number++;
        }
    }
}
