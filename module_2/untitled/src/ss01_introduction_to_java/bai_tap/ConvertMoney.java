package ss01_introduction_to_java.bai_tap;

import java.util.Scanner;

public class ConvertMoney {
    public static void main(String[] args) {
        double vnd = 24000;
        double usd;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap usd: ");
        usd = sc.nextDouble();
        double quydoi = usd * vnd;
        System.out.println("Gia tri vnd: " + quydoi);
    }
}
