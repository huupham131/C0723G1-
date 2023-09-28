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
    public void handleFacilityManagementOption() {
        int option = 0;
        do {
            try {
                System.out.println("Please select feature:");
                option = Integer.parseInt(scanner.nextLine());
            }catch (NumberFormatException e){
                System.out.println("feature is INTEGER");
            }
        } while (option <= 0 || option > 5);
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
                    return;
            }
        }
    }
