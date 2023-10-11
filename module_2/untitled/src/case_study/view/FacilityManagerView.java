package case_study.view;

import case_study.controller.FacilityController;
import case_study.model.facility.House;
import case_study.model.facility.Room;
import case_study.model.facility.Villa;
import case_study.util.Regex;

import java.util.Scanner;

public class FacilityManagerView {
    private final FacilityController facilityController = new FacilityController();
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
                System.out.println(facilityController.display());
                break;
            case 2:
                facilityAddDetailMenu();
                break;
            case 3:
                System.out.println(facilityController.displayListMaintenance());
                break;
            case 4:
                String id;
                System.out.println("Enter service code");
                id = scanner.nextLine();
                facilityController.delete(id);
                break;
            case 5:
                break;
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
                Villa villa = new Villa();
                villa.setServiceCode(inputServiceCode("SVVL-"));
                villa.setServiceName(inputServiceName());
                villa.setAcreage(inputAcreage());
                villa.setPrice(inputPrice());
                villa.setMaxPerson(inputMaxPerson());
                villa.setRentalType(inputRentalType());
                villa.setPoolArea(inputPoolArea());
                villa.setStandardVilla(inputTypeOfRoom());
                villa.setNumberOfFloors(inputNumberOfFloors());
                facilityController.add(villa);
                break;
            case 2:
                House house = new House();
                house.setServiceCode(inputServiceCode("SVHO-"));
                house.setServiceName(inputServiceName());
                house.setAcreage(inputAcreage());
                house.setPrice(inputPrice());
                house.setMaxPerson(inputMaxPerson());
                house.setRentalType(inputRentalType());
                house.setTypeOfRoom(inputTypeOfRoom());
                house.setNumberOfFloors(inputNumberOfFloors());
                facilityController.add(house);
                break;
            case 3:
                Room room = new Room();
                room.setServiceCode(inputServiceCode("SVRO-"));
                room.setServiceName(inputServiceName());
                room.setAcreage(inputAcreage());
                room.setPrice(inputPrice());
                room.setMaxPerson(inputMaxPerson());
                room.setRentalType(inputRentalType());
                room.setFreeService(inputFreeService());
                facilityController.add(room);
                break;
            case 4:
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
                System.out.println("Please select feature (1 to 3):");
                option = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("feature is INTEGER");
            }
        } while (option <= 0 || option > 4);
        return option;
    }

    public void facilityAddDetailMenu() {
        int temp;
        do {
            displayAddNewFacility();
            temp = inputOption();
            handleAddNewFacility(temp);
        } while (temp != 4);
    }

    public String inputServiceCode(String code) {
        String serviceCode = code;
        String inputCode;
        do {
            System.out.println(code + " Enter code XXXX(X is Integer):");
            inputCode = scanner.nextLine();
        } while (!Regex.codeValidate(inputCode));
        serviceCode = serviceCode.concat(inputCode);
        return serviceCode;
    }

    public String inputServiceName() {
        String serviceName;
        do {
            System.out.println("Enter service name:");
            serviceName = scanner.nextLine();
        } while (!Regex.nameValidate(serviceName));
        return serviceName;
    }
    public double inputAcreage(){
        double acreage;
            System.out.println("Enter service acreage");
            acreage = Double.parseDouble(scanner.nextLine());
            return acreage;
    }
    public double inputPrice(){
        double price;
        System.out.println("Enter service price");
        price = Double.parseDouble(scanner.nextLine());
        return price;
    }
    public int inputMaxPerson(){
        int maxPerson;
        System.out.println("Enter service max person");
        maxPerson = Integer.parseInt(scanner.nextLine());
        return maxPerson;
    }
    public String inputRentalType(){
        String rentalType;
        System.out.println("Enter rental type");
        rentalType = scanner.nextLine();
        return rentalType;
    }
    public double inputPoolArea(){
        double poolArea;
        System.out.println("Enter pool area");
        poolArea = Double.parseDouble(scanner.nextLine());
        return poolArea;
    }
    public String inputTypeOfRoom(){
        String typeOfRoom;
        System.out.println("Enter type of room");
        typeOfRoom = scanner.nextLine();
        return typeOfRoom;
    }
    public int inputNumberOfFloors(){
        int numberOfFloors;
        System.out.println("Enter number of floor");
        numberOfFloors = Integer.parseInt(scanner.nextLine());
        return numberOfFloors;
    }
    public String inputFreeService(){
        String freeService;
        System.out.println("Enter free service");
        freeService = scanner.nextLine();
        return freeService;
    }
}
