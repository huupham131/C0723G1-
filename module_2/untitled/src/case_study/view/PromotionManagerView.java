package case_study.view;

import java.util.Scanner;

public class PromotionManagerView {
    private final Scanner scanner = new Scanner(System.in);
    public void displayPromotionMenu() {
        System.out.println("1. Display list customers use service");
        System.out.println("2. Display list customers use voucher");
        System.out.println("3. Return main menu");
    }
    public void handlePromotionManagementOption() {
        int option;
        do {
            System.out.println("Please select feature:");
            option = Integer.parseInt(scanner.nextLine());
        } while (option <= 0 || option > 3);
        switch (option) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                return;
        }
    }
}
