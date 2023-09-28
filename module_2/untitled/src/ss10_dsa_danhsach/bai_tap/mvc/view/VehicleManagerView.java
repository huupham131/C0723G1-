package ss10_dsa_danhsach.bai_tap.mvc.view;

import ss10_dsa_danhsach.bai_tap.mvc.controller.VehicleController;
import ss10_dsa_danhsach.bai_tap.mvc.model.*;

import java.util.Scanner;

public class VehicleManagerView {
    private final Scanner scanner = new Scanner(System.in);
    private final VehicleController<Car> carController = new VehicleController();
    private final VehicleController<Truck> truckController = new VehicleController();
    private final VehicleController<Motorbike> motorbikeController = new VehicleController();
    private int indexOfCar = -1;
    private int indexOfTruck = -1;
    private int indexOfMotorbike = -1;

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
                displaySelect();
                int display = Integer.parseInt(scanner.nextLine());
                if (display == 1) {
                    carController.addVehicle(inputCar());
                } else if (display == 2) {
                    truckController.addVehicle(inputTruck());
                } else if (display == 3) {
                    motorbikeController.addVehicle(inputMotorbike());
                } else {
                    System.out.println("The vehicle type you selected is not available");
                }
                break;
            case 2:
                System.out.println("What type of vehicle do you wan display?");
                displaySelect();
                int displayVehicle = Integer.parseInt(scanner.nextLine());
                if (displayVehicle == 1) {
                    carController.displayVehicle();
                } else if (displayVehicle == 2) {
                    truckController.displayVehicle();
                } else if (displayVehicle == 3) {
                    motorbikeController.displayVehicle();
                } else {
                    System.out.println("The vehicle type you selected is not available");
                }
                break;
            case 3:
                System.out.println("What type of vehicle do you wan delete?");
                displaySelect();
                int delete = Integer.parseInt(scanner.nextLine());
                if (delete == 1) {
                    getIndexOfVehicle(inputLicensePlates());
                    if (indexOfCar == -1) {
                        System.out.println("Not find vehicle");
                    } else {
                        carController.getAllVehicles().remove(indexOfCar);
                        System.out.println("Delete Complete!");
                    }
                } else if (delete == 2) {
                    getIndexOfVehicle(inputLicensePlates());
                    if (indexOfTruck == -1) {
                        System.out.println("Not find vehicle");
                    } else {
                        truckController.getAllVehicles().remove(indexOfTruck);
                        System.out.println("Delete Complete!");
                    }
                } else if (delete == 3) {
                    getIndexOfVehicle(inputLicensePlates());
                    if (indexOfMotorbike == -1) {
                        System.out.println("Not find vehicle");
                    } else {
                        motorbikeController.getAllVehicles().remove(indexOfMotorbike);
                        System.out.println("Delete Complete!");
                    }
                } else {
                    System.out.println("The vehicle type you selected is not available");
                }
                break;
            case 4:
                System.out.println("What type of vehicle do you wan display?");
                displaySelect();
                int displayById = Integer.parseInt(scanner.nextLine());
                if (displayById == 1) {
                    getIndexOfVehicle(inputLicensePlates());
                    if (indexOfCar == -1) {
                        System.out.println("Not find vehicle");
                    } else {
                        displayCarById();
                    }
                } else if (displayById == 2) {
                    getIndexOfVehicle(inputLicensePlates());
                    if (indexOfTruck == -1) {
                        System.out.println("Not find vehicle");
                    } else {
                        displayTruckById();
                    }
                } else if (displayById == 3) {
                    getIndexOfVehicle(inputLicensePlates());
                    if (indexOfMotorbike == -1) {
                        System.out.println("Not find vehicle");
                    } else {
                        displayMotorbikeById();
                    }
                } else {
                    System.out.println("The vehicle type you selected is not available");
                }
                break;
            case 5:
                System.exit(0);
        }
    }

    private void displayCarById() {
        if (indexOfCar != -1) {
            System.out.println(carController.getVehicleDetail(indexOfCar));
        }
    }

    private void displayTruckById() {
        if (indexOfTruck != -1) {
            System.out.println(truckController.getVehicleDetail(indexOfTruck));
        }
    }

    private void displayMotorbikeById() {
        if (indexOfMotorbike != -1) {
            System.out.println(motorbikeController.getVehicleDetail(indexOfMotorbike));
        }
    }

    public String inputLicensePlates() {
        System.out.println("Enter license Plates");
        String licensePlates = scanner.nextLine();
        return licensePlates;
    }

    public void getIndexOfVehicle(String licensePlate) {
        for (int i = 0; i < carController.getAllVehicles().size(); i++) {
            if (carController.getAllVehicles().get(i).getLicensePlates().equals(licensePlate)) {
                indexOfCar = i;
                break;
            }
        }

        for (int i = 0; i < carController.getAllVehicles().size(); i++) {
            if (carController.getAllVehicles().get(i).getLicensePlates().equals(licensePlate)) {
                indexOfTruck = i;
                break;
            }
        }
        for (int i = 0; i < carController.getAllVehicles().size(); i++) {
            if (carController.getAllVehicles().get(i).getLicensePlates().equals(licensePlate)) {
                indexOfMotorbike = i;
                break;
            }
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
        Manufacturer manufacturer = manufacturerCar();
        System.out.println("Enter year Of Manufacture");
        int year = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter Owner");
        String owner = scanner.nextLine();
        System.out.println("Enter Number of seat");
        int seats = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter Car Type");
        String carType = scanner.nextLine();
        return new Car(licensePlates, manufacturer, year, owner, seats, carType);
    }

    public Truck inputTruck() {
        System.out.println("Enter license plates");
        String licensePlates = scanner.nextLine();
        Manufacturer manufacturer = manufacturerTruck();
        System.out.println("Enter year Of Manufacture");
        int year = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter Owner");
        String owner = scanner.nextLine();
        System.out.println("Enter Number of payload");
        int payload = Integer.parseInt(scanner.nextLine());
        return new Truck(licensePlates, manufacturer, year, owner, payload);
    }

    public Motorbike inputMotorbike() {
        System.out.println("Enter license plates");
        String licensePlates = scanner.nextLine();
        Manufacturer manufacturer = manufacturerMotor();
        System.out.println("Enter year Of Manufacture");
        int year = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter Owner");
        String owner = scanner.nextLine();
        System.out.println("Enter Number of wattage");
        int wattage = Integer.parseInt(scanner.nextLine());
        return new Motorbike(licensePlates, manufacturer, year, owner, wattage);
    }

    public void displaySelect() {
        System.out.println("1. Car");
        System.out.println("2. Truck");
        System.out.println("3. Motorbike");
    }

    public Manufacturer manufacturerCar() {
        Manufacturer porsche = new Manufacturer(1, "Porsche", "Germany");
        Manufacturer xeBo = new Manufacturer(2, "Xe Bò", "Việt Nam");
        Manufacturer ferrari = new Manufacturer(3, "Ferrari", "Italia");
        System.out.println("Enter Manufacturer: ");
        System.out.println("1.Porsche");
        System.out.println("2.Xe Bò");
        System.out.println("3.Ferrari");
        int choice;
        while (true) {
            choice = Integer.parseInt(scanner.nextLine());
            if (choice == 1) {
                return porsche;
            } else if (choice == 2) {
                return xeBo;
            } else if (choice == 3) {
                return ferrari;
            } else {
                System.out.println("Try again!");
            }
        }
    }

    public Manufacturer manufacturerMotor() {
        Manufacturer yamaha = new Manufacturer(1, "Yamaha", "Japan");
        Manufacturer honda = new Manufacturer(2, "Honda", "Japan");
        Manufacturer vinfast = new Manufacturer(3, "Vinfast", "Việt Nam");
        System.out.println("Enter Manufacturer: ");
        System.out.println("1.Porsche");
        System.out.println("2.Xe Bò");
        System.out.println("3.Ferrari");
        int choice;
        while (true) {
            choice = Integer.parseInt(scanner.nextLine());
            if (choice == 1) {
                return yamaha;
            } else if (choice == 2) {
                return honda;
            } else if (choice == 3) {
                return vinfast;
            } else {
                System.out.println("Try again!");
            }
        }
    }

    public Manufacturer manufacturerTruck() {
        Manufacturer huynhdai = new Manufacturer(1, "Hyundai", "Korea");
        Manufacturer truongHai = new Manufacturer(2, "Trường Hải", "Việt Nam");
        Manufacturer xeCongNong = new Manufacturer(3, "Công Nông", "Việt Nam");
        System.out.println("Enter Manufacturer: ");
        System.out.println("1.Porsche");
        System.out.println("2.Xe Bò");
        System.out.println("3.Ferrari");
        int choice;
        while (true) {
            choice = Integer.parseInt(scanner.nextLine());
            if (choice == 1) {
                return huynhdai;
            } else if (choice == 2) {
                return truongHai;
            } else if (choice == 3) {
                return xeCongNong;
            } else {
                System.out.println("Try again!");
            }
        }
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
