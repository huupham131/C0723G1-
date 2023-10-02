package case_study.view;

import java.util.Scanner;

public class FuramaManagerView {
    Scanner scanner = new Scanner(System.in);

    public void displayMainMenu() {
        System.out.println("====Main Menu====");
        System.out.println("1. Employee Management");
        System.out.println("2. Customer Management");
        System.out.println("3. Facility Management");
        System.out.println("4. Booking Management");
        System.out.println("5. Promotion Management");
        System.out.println("6. Exit");
    }

    public int inputOption() {
        int option = 0;
        do {
            try {
                System.out.println("Please select feature:");
                option = Integer.parseInt(scanner.nextLine());
                if(option>6 || option<=0){
                    System.out.println("Please choice 1 to 6");
                }
            } catch (NumberFormatException e) {
                System.out.println("feature is INTEGER");
            }
        } while (option <= 0 || option > 6);
        return option;
    }

    public void handleFuramaManagementOption(int option) {

        switch (option) {
            case 1:
                EmployeeManagerView employeeManagerView = new EmployeeManagerView();
                employeeManagerView.employeeMenu();
                break;
            case 2:
                CustomerManagerView customerManagerView = new CustomerManagerView();
                customerManagerView.customerMenu();
                break;
            case 3:
                FacilityManagerView facilityManagerView = new FacilityManagerView();
                facilityManagerView.facilityMenu();
                break;
            case 4:
                BookingManagerView bookingManagerView = new BookingManagerView();
                bookingManagerView.menuBooking();
                break;
            case 5:
                PromotionManagerView promotionManagerView = new PromotionManagerView();
                promotionManagerView.menuPromotion();
                break;
            case 6:
                System.exit(1);
        }

    }

    public void render() {
        while (true) {
            displayMainMenu();
            handleFuramaManagementOption(inputOption());
        }
    }
}
