package ss10_dsa_danhsach.bai_tap.mvc.view;

import ss10_dsa_danhsach.bai_tap.mvc.controller.VehicleController;
import ss10_dsa_danhsach.bai_tap.mvc.model.Car;
import ss10_dsa_danhsach.bai_tap.mvc.model.Motorbike;
import ss10_dsa_danhsach.bai_tap.mvc.model.Truck;
import ss10_dsa_danhsach.bai_tap.mvc.model.Vehicle;

import java.util.Scanner;

public class VehicleManagerView<E extends Vehicle> {
    private final Scanner scanner = new Scanner(System.in);
    private VehicleController<Car> carController = new VehicleController();
    private VehicleController<Truck> truckController = new VehicleController();
    private VehicleController<Motorbike> motorbikeController = new VehicleController();
    private VehicleController<E> vehicleController = new VehicleController<>();

    public int inputOption() {
        int option = 0;
        do {
            displayVehicleManagerView();
            System.out.println("Please select feature:");
            option = Integer.parseInt(scanner.nextLine());
        } while (option <= 0 || option >= 5);
        return option;
    }

    public void handleVehicleManagementOption(int option) {
        switch (option) {
            case 1:
                System.out.println("What type of vehicle do you wan create?");
                System.out.println("1. Car");
                System.out.println("2. Truck");
                System.out.println("3. Motorbike");
                int typeOf = Integer.parseInt(scanner.nextLine());
                if (typeOf == 1) {
                    carController.addVehicle(inputCar());
                } else if (typeOf == 2) {
                    truckController.addVehicle(inputTruck());
                } else if (typeOf == 3) {
                    motorbikeController.addVehicle(inputMotorbike());
                } else {
                    System.out.println("The vehicle type you selected is not available");
                }
                break;
            case 2:
                System.out.println("What type of vehicle do you wan display?");
                System.out.println("1. Car");
                System.out.println("2. Truck");
                System.out.println("3. Motorbike");
                int display = Integer.parseInt(scanner.nextLine());
                if (display == 1) {
                    carController.displayVehicle();
                } else if (display == 2) {
                    truckController.displayVehicle();
                } else if (display == 3) {
                    motorbikeController.displayVehicle();
                } else {
                    System.out.println("The vehicle type you selected is not available");
                }
                break;
            case 3:
                System.out.println("What license Plates of vehicle do you wan delete?");
                String delete = scanner.nextLine();
                if (vehicleController.isLicensePlates(delete)) {
//                    vehicleController.removeVehicle();
                }
            case 4:
                break;
            case 5 :
                System.exit(0);
        }
    }

    public void render() {
        while (true) {
            handleVehicleManagementOption(inputOption());
        }
    }

    public Car inputCar() {
        System.out.println("Enter license plates");
        String licensePlates = scanner.nextLine();
        System.out.println("Enter brand Name");
        String brandName = scanner.nextLine();
        System.out.println("Enter year Of Manufacture");
        int year = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter Owner");
        String owner = scanner.nextLine();
        System.out.println("Enter Number of seat");
        int seats = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter Car Type");
        String carType = scanner.nextLine();
        return new Car(licensePlates, brandName, year, owner, seats, carType);
    }

    public Truck inputTruck() {
        System.out.println("Enter license plates");
        String licensePlates = scanner.nextLine();
        System.out.println("Enter brand Name");
        String brandName = scanner.nextLine();
        System.out.println("Enter year Of Manufacture");
        int year = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter Owner");
        String owner = scanner.nextLine();
        System.out.println("Enter Number of payload");
        int payload = Integer.parseInt(scanner.nextLine());
        return new Truck(licensePlates, brandName, year, owner, payload);
    }

    public Motorbike inputMotorbike() {
        System.out.println("Enter license plates");
        String licensePlates = scanner.nextLine();
        System.out.println("Enter brand Name");
        String brandName = scanner.nextLine();
        System.out.println("Enter year Of Manufacture");
        int year = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter Owner");
        String owner = scanner.nextLine();
        System.out.println("Enter Number of wattage");
        int wattage = Integer.parseInt(scanner.nextLine());
        return new Motorbike(licensePlates, brandName, year, owner, wattage);
    }

    public void displayVehicleManagerView() {
        System.out.println("==== Vehicle Manager Tool ====");
        System.out.println("1. Create new vehicle");
        System.out.println("2. Display vehicle");
        System.out.println("3. Delete vehicle");
        System.out.println("4. Search vehicle by license plates");
        System.out.println("5. Exit");
    }
}
