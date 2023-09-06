package ss2_loop_java.bai_tap;

import java.util.Scanner;

public class DisplayPrimeLessThan100 {
    public static void main(String[] args) {
        int number = 2;
        while (number < 100) {
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
            }
            number++;
        }
    }
}
