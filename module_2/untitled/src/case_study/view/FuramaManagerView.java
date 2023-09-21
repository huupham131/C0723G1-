package case_study.view;

import java.util.Scanner;

public class FuramaManagerView {
    EmployeeManagerView employeeManegerView = new EmployeeManagerView();
    CustomerManagerView customerManagerView = new CustomerManagerView();
    FacilityManagerView facilityManagerView = new FacilityManagerView();
    BookingManagerView bookingManagerView = new BookingManagerView();
    PromotionManagerView promotionManagerView = new PromotionManagerView();
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
                employeeManegerView.displayEmployeeMenu();
                inputOption();
                break;
            case 2:
                customerManagerView.displayCustomerMenu();
                break;
            case 3:
                facilityManagerView.displayFacilityMenu();
                break;
            case 4:
                bookingManagerView.displayBookingMenu();
                break;
            case 5:
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
