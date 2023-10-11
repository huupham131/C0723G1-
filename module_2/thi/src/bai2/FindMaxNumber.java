package bai2;

import java.util.Scanner;

public class FindMaxNumber {
    public static int findMaxNumber(int n) {
        int max = 0;
        if (n >= 1000 && n < 10000) {
            System.out.println("n là số có bốn chữ số");
            int[] arrayNumber = new int[4];
            arrayNumber[0] = n / 1000;
            arrayNumber[1] = n % 1000 / 100;
            arrayNumber[2] = n % 1000 % 100 / 10;
            arrayNumber[3] = n % 1000 % 100 % 10;

            for (int i = 0; i < arrayNumber.length; i++) {
                String string = "";
                for (int j = 0; j < arrayNumber.length; j++) {
                    if(i!=j) {
                        string += arrayNumber[j];
                    }
                }
                if(max<Integer.parseInt(string)){
                    max = Integer.parseInt(string);
                }
            }
            return max;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter n(Integer)");
        int n;
        try {
            n = Integer.parseInt(scanner.nextLine());
            System.out.println(findMaxNumber(n));
        }catch (NumberFormatException e){
            System.out.println("Nhập số đi");
        }


    }
}
