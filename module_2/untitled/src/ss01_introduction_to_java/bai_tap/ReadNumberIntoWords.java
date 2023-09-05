package ss01_introduction_to_java.bai_tap;

import java.util.Scanner;

public class ReadNumberIntoWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số cần đọc: ");
        int number = Integer.parseInt(sc.nextLine());
        int ones = (number % 100) % 10;
        int hundred = number / 100;
        int tens = (number - hundred * 100) / 10;
        String[] zeroToNine = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        String[] tenToNineteen = {"Ten", "Eleven", "Twelve", "Thirdteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
        String[] tensUnit = {"Ten", "Twenty", "Thirdty", "Fourty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
        if (number >= 0 && number < 1000) {
            if (hundred == 0) {
                if (tens == 0) {
                    System.out.println(number + " read as " + zeroToNine[ones]);
                } else if (tens == 1) {
                    System.out.println(number + " read as " + tenToNineteen[ones]);
                } else if (ones == 0) {
                    System.out.println(number + " read as " + tensUnit[tens - 1]);
                } else {
                    System.out.println(number + " read as " + tensUnit[tens - 1] + " " + zeroToNine[ones]);
                }
            } else {
                if (tens == 0 && ones == 0) {
                    System.out.println(number + " read as " + zeroToNine[hundred] + " hundred");
                } else if (tens == 0) {
                    System.out.println(number + " read as " + zeroToNine[hundred] + " hundred and " + zeroToNine[ones]);
                } else if (tens == 1) {
                    System.out.println(number + " read as " + zeroToNine[hundred] + " hundred and " + tenToNineteen[ones]);
                } else if (ones == 0) {
                    System.out.println(number + " read as " + zeroToNine[hundred] + " hundred and " + tensUnit[tens - 1]);
                } else {
                    System.out.println(number + " read as " + zeroToNine[hundred] + " hundred and " + tensUnit[tens - 1] + " " + zeroToNine[ones]);
                }
            }
        } else {
            System.out.println("Out of ability");
        }
    }
}
