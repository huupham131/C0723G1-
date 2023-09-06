package ss3_array_method_java.bai_tap;

import java.util.Scanner;

public class CountOfChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chuoi: ");
        String str = sc.nextLine();
        System.out.println("Chuỗi vừa nhập là: " + str);
        System.out.println("Nhập ký tự cần kiểm tra: ");
        char character = sc.next().charAt(0);
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (character == str.charAt(i)) {
                count++;
            }
        }
        System.out.println("Co " + count + " ky tu " + character + " trong chuoi");
    }
}
