package case_study.view;

import java.util.Scanner;

public class PromotionManagerView {
    private final Scanner scanner = new Scanner(System.in);
    public void displayPromotionMenu() {
        System.out.println("1. Display list customers use service");
        System.out.println("2. Display list customers use voucher");
        System.out.println("3. Return main menu");
    }
    public int inputOption(){
        int option =0;
        do {
            try {
                System.out.println("Please select feature:");
                option = Integer.parseInt(scanner.nextLine());
            }catch (NumberFormatException e){
                System.out.println("feature is INTEGER");
            }
        } while (option <= 0 || option > 3);
        return option;
    }
    public void handlePromotionManagementOption(int option) {
        switch (option) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                return;
        }
    }
    public void menuPromotion(){
        int temp;
        do{
            displayPromotionMenu();
            temp = inputOption();
            handlePromotionManagementOption(temp);
        }while (temp!=3);
    }
}
