package bai3.view;

import bai3.controller.ElectronicBillController;
import bai3.model.ElectronicBill;
import bai3.util.Regex;

import java.util.List;
import java.util.Scanner;

public class ElectronicBillManagerView {
    private final ElectronicBillController electronicBillController = new ElectronicBillController();
    private Scanner scanner = new Scanner(System.in);

    public void displayMenu() {
        System.out.println("====Electronic Bill Management====");
        System.out.println("""
                1. Create new electronic bill
                2. Display all electronic bill
                3. Exit
                """);
    }

    public void handleElectronicBillManagement(int option) {
        switch (option) {
            case 1:
                ElectronicBill electronicBill = new ElectronicBill();
                electronicBill.setIdBill(inputId());
                electronicBill.setNameCustomer(inputName());
                electronicBill.setTypeOfCustomer(inputTypeOfCustomer());
                electronicBill.setElectricUsed(inputElectricUsed());
                electronicBillController.create(electronicBill);
                System.out.println("Create completed");
                break;
            case 2:
                System.out.println(electronicBillController.getAllElectronicBill());
                break;
            case 3:
                System.exit(1);
        }
    }

    public void render() {
        while (true) {
            displayMenu();
            handleElectronicBillManagement(inputOption());
        }
    }

    public int inputOption() {
        int choice;
        do {
            try {
                System.out.println("Enter your choice(1 to 3):");
                choice = Integer.parseInt(scanner.nextLine());
                if (choice < 0 || choice > 3) {
                    System.out.println("Please choose 1 to 3");
                } else {
                    return choice;
                }

            } catch (NumberFormatException e) {
                System.out.println("Please enter integer");
            }
        } while (true);
    }

    public String inputId() {
        String id;
        do {
            System.out.println("Enter new id (MHD-XXXX) (X from 0-9):");
            id = scanner.nextLine();
            if (!(Regex.idValidate(id))) {
                System.out.println("ID invalid");
            } else {
                if (!(checkID(id))) {
                    return id;
                } else {
                    System.out.println("id was existed");
                }
            }
        } while (true);

    }

    public String inputName() {
        String name;
        do {
            System.out.println("Enter name:");
            name = scanner.nextLine().trim();
            if (name.isEmpty()) {
                System.out.println("Name is Empty. Please enter again");
            } else {
                return name;
            }
        } while (true);
    }

    public String inputTypeOfCustomer() {
        String typeOfCustomer;
        int choose;
        do {
            System.out.println("""
                    Choose type of customer:
                    1. Sinh hoạt\s
                    2. Hộ kinh doanh""");
            choose = Integer.parseInt(scanner.nextLine());
            if (choose == 1) {
                typeOfCustomer = "Sinh hoạt";
                return typeOfCustomer;
            } else if (choose == 2) {
                typeOfCustomer = "Hộ kinh doanh";
                return typeOfCustomer;
            } else {
                System.out.println("Please choose 1 or 2");
            }
        } while (true);
    }

    public int inputElectricUsed() {
        int electricUsed;
        do {
            System.out.println("Enter electricUsed:");
            electricUsed = Integer.parseInt(scanner.nextLine());
            if (electricUsed > 0) {
                return electricUsed;
            } else {
                System.out.println("electricUsed greater than 0.Please try again");
            }
        } while (true);
    }

    public boolean checkID(String id) {
        List<ElectronicBill> data = electronicBillController.getAllElectronicBill();
        boolean flag = false;
        for (ElectronicBill electronicBill : data) {
            if (electronicBill.getIdBill().equals(id)) {
                flag = true;
                break;
            }
        }
        return flag;
    }
}
