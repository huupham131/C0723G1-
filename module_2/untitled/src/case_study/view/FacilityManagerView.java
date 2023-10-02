package case_study.view;

import java.util.Scanner;

public class FacilityManagerView {
    private final Scanner scanner = new Scanner(System.in);

    public void displayFacilityMenu() {
        System.out.println("---Facility Menu---");
        System.out.println("1. Display list facility");
        System.out.println("2. Add new facility");
        System.out.println("3. Display list facility maintenance");
        System.out.println("4. Delete facility");
        System.out.println("5. Return main menu");
    }

    public int inputOption() {
        int option = 0;
        do {
            try {
                System.out.println("Please select feature:");
                option = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("feature is INTEGER");
            }
        } while (option <= 0 || option > 5);
        return option;
    }

    public void handleFacilityManagementOption(int option) {

        switch (option) {
            case 1:
                facilityMenu();
                break;
            case 2:
                displayAddNewFacility();
                handleAddNewFacility(inputMiniOption());
                break;
            case 3:

                break;
            case 4:
                facilityMenu();
                break;
            case 5:
                return;
        }
    }

    public void facilityMenu() {
        int temp;
        do {
            displayFacilityMenu();
            temp = inputOption();
            handleFacilityManagementOption(temp);
        } while (temp != 5);
    }

    public void displayAddNewFacility() {
        System.out.println("1. Add New Villa");
        System.out.println("2. Add New House");
        System.out.println("3. Add New Room");
        System.out.println("4. Back to menu");
    }

    public void handleAddNewFacility(int option) {
        switch (option) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                facilityMenu();
                break;
        }
    }

    public void displayDetailFacility() {
        System.out.println("1. Villa");
        System.out.println("2. House");
        System.out.println("3. Room");
        System.out.println("4. Back to menu");
    }

    public int inputMiniOption() {
        int option = 0;
        do {
            try {
                System.out.println("Please select feature:");
                option = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("feature is INTEGER");
            }
        } while (option <= 0 || option > 4);
        return option;
    }

    public void facilityDetailMenu() {
        int temp;
        do {
            displayDetailFacility();
            temp = inputOption();
            handleAddNewFacility(temp);
        } while (temp != 4);
    }
}
