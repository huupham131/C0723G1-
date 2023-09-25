package case_study.view;

import java.util.Scanner;

public class FuramaManagerView {
    Scanner scanner = new Scanner(System.in);

    public void displayMainMenu() {
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
            System.out.println("Please select feature:");
            option = Integer.parseInt(scanner.nextLine());
        } while (option <= 0 || option >= 6);
        return option;
    }

    public void handleFuramaManagementOption(int option) {
        switch (option) {
            case 1:
                EmployeeManagerView employeeManegerView = new EmployeeManagerView();
                employeeManegerView.displayEmployeeMenu();
                employeeManegerView.handleEmployeeManagementOption(inputOption());
                break;
            case 2:
                CustomerManagerView customerManagerView = new CustomerManagerView();
                customerManagerView.displayCustomerMenu();
                break;
            case 3:
                FacilityManagerView facilityManagerView = new FacilityManagerView();
                facilityManagerView.displayFacilityMenu();
                break;
            case 4:
                BookingManagerView bookingManagerView = new BookingManagerView();
                bookingManagerView.displayBookingMenu();
                break;
            case 5:
                PromotionManagerView promotionManagerView = new PromotionManagerView();
                promotionManagerView.displayPromotionMenu();
                break;
            case 6:
                System.exit(0);
        }

    }

    public void render() {
        displayMainMenu();
        handleFuramaManagementOption(inputOption());
    }
}
