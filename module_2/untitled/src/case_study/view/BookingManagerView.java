package case_study.view;

import java.util.Scanner;

public class BookingManagerView {
    Scanner scanner = new Scanner(System.in);
    public void displayBookingMenu(){
        System.out.println("1. Add new booking");
        System.out.println("2. Display list booking");
        System.out.println("3. Create new contracts");
        System.out.println("4. Display list contracts");
        System.out.println("5. Edit contracts");
        System.out.println("6. Return main menu");
    }
    public int inputOption() {
        int option = 0;
        do {
            try {
                System.out.println("Please select feature:");
                option = Integer.parseInt(scanner.nextLine());
            }catch (NumberFormatException e){
                System.out.println("feature is INTEGER");
            }
        } while (option <= 0 || option > 6);
        return option;
    }
    public void handleBookingManagementOption(int option) {
        switch (option) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                return;
        }
    }
    public void menuBooking(){
        int temp;
        do{
            displayBookingMenu();
            temp = inputOption();
            handleBookingManagementOption(temp);
        } while (temp!=6);
    }
}
