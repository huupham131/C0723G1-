package case_study.view;

import java.util.Scanner;

public class EmployeeManagerView {
    private final FuramaManagerView furamaManagerView = new FuramaManagerView();
    private final Scanner scanner = new Scanner(System.in);

    public void displayEmployeeMenu() {
        System.out.println("---Employee Menu---");
        System.out.println("1. Display list employees");
        System.out.println("2. Add new employee");
        System.out.println("3. Edit employee");
        System.out.println("4. Delete employee");
        System.out.println("5. Search by name employee");
        System.out.println("6. Return main menu");
    }

    public int inputOption() {
        int option = 0;
        do {
            System.out.println("Please select feature:");
            option = Integer.parseInt(scanner.nextLine());
        } while (option <= 0 || option > 6);
        return option;
    }

    public void handleEmployeeManagementOption(int option) {
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
}
