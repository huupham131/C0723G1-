package ss01_introduction_to_java.bai_tap;

import java.util.Scanner;

public class ConvertMoney {
    public static void main(String[] args) {
        double rate = 24000;
        double usd;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap usd: ");
        usd = sc.nextDouble();
        double vnd = usd * rate;
        System.out.println("Gia tri vnd: " + vnd);
    }
}
