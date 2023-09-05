package ss2_loop_java.bai_tap;

import java.util.Scanner;

public class DisplayGeometry {
    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Draw the triangle");
            System.out.println("2. Draw the square");
            System.out.println("3. Draw the rectangle");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                for(int i=0;i<3;i++){
                    for (int j =0; j < 7; j++){
                        System.out.print("*");
                    }
                    System.out.print("\n");
                }
                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 0:

                default:
                    System.out.println("No choice!");
            }
        }
    }
}
