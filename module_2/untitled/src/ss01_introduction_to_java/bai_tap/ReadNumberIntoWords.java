package ss01_introduction_to_java.bai_tap;

import java.util.Scanner;

public class ReadNumberIntoWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số cần đọc: ");
        int number = sc.nextInt();
        if(number >= 0 && number <10){
            switch(number){
                case 0 :
                    System.out.println("Zero");

                case 1 :
                    System.out.println("One");
                    break;
                case 2 :
                    System.out.println("Two");
                    break;
                case 3 :
                    System.out.println("Three");
                    break;
                case 4 :
                    System.out.println("Four");
                    break;
                case 5 :
                    System.out.println("Five");
                    break;
                case 6 :
                    System.out.println("Six");
                    break;
                case 7 :
                    System.out.println("Seven");
                    break;
                case 8 :
                    System.out.println("Eight");
                    break;
                case 9 :
                    System.out.println("Nine");
                    break;
            }
        }
    }
}
