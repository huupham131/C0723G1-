package case_study.view;

import case_study.controller.CustomerController;
import case_study.model.person.Customer;
import case_study.util.Regex;

import java.util.Scanner;

public class CustomerManagerView {
    private final CustomerController customerController = new CustomerController();
    private final Scanner scanner = new Scanner(System.in);

    public void displayCustomerMenu() {
        System.out.println("---Customer Menu---");
        System.out.println("1. Display list customers");
        System.out.println("2. Add new customer");
        System.out.println("3. Edit customer");
        System.out.println("4. Delete customer");
        System.out.println("5. Search by name customer");
        System.out.println("6. Return main menu");
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
            }catch (NumberFormatException e){
                System.out.println("feature is INTEGER");
            }
        } while (option <= 0 || option > 6);
        return option;
    }
    public void handleCustomerManagementOption(int option) {
        switch (option) {
            case 1:
                System.out.println(customerController.display());
                break;
            case 2:
                customerController.add(inputCustomer());
                break;
            case 3:
                System.out.println("Enter id:");
                String id = scanner.nextLine();
                if (checkId(id)) {
                    Customer customer = new Customer();
                    customer.setIdCustomer(id);
                    customer.setName(inputName());
                    customer.setDateOfBirth(inputDayOfBirth());
                    customer.setGender(inputGender());
                    customer.setIdCard(inputIdCard());
                    customer.setPhoneNumber(inputPhoneNumber());
                    customer.setEmail(inputEmail());
                    customer.setTypeOfCustomer(inputTypeOfCustomer());
                    customer.setAddress(inputAddress());
                }
                break;
            case 4:
                System.out.println("Enter id:");
                String idDelete = scanner.nextLine();
                if (checkId(idDelete)) {
                    customerController.delete(idDelete);
                } else {
                    System.out.println("Id not found");
                }
                break;
            case 5:
                System.out.println("Enter name:");
                String name = scanner.nextLine();
                System.out.println(customerController.searchByName(name));
                break;
            case 6:
                return;
        }
    }
    public void customerMenu(){
        int temp;
        do{
            displayCustomerMenu();
            temp = inputOption();
            handleCustomerManagementOption(temp);
        }while (temp!=6);
    }

    public Customer inputCustomer() {
        Customer customer = new Customer();
        customer.setIdCustomer(inputId());
        customer.setName(inputName());
        customer.setDateOfBirth(inputDayOfBirth());
        customer.setGender(inputGender());
        customer.setIdCard(inputIdCard());
        customer.setPhoneNumber(inputPhoneNumber());
        customer.setEmail(inputEmail());
        customer.setTypeOfCustomer(inputTypeOfCustomer());
        customer.setAddress(inputAddress());
        return customer;
    }

    public boolean checkId(String id) {
        boolean check = false;
        for (Customer customer : customerController.display()) {
            if (customer.getIdCustomer().equals(id)) {
                check = true;
            }
        }
        return check;
    }

    public String inputId() {
        String id;
        do {
            System.out.println("Enter id of Customer(KH-YYYY):");
            id = scanner.nextLine();
            if (checkId(id)) {
                System.out.println("Id already exists. Please enter id again:");
            }
        } while (!Regex.idCustomerValidate(id) || checkId(id));
        return id;
    }

    public String inputName() {
        String name;
        do {
            System.out.println("Enter name of customer:");
            name = scanner.nextLine();
        } while (!Regex.NameValidate(name));
        return name;
    }

    public String inputDayOfBirth() {
        String dOB;
        do {
            System.out.println("Enter day of birth of customer (dd/mm/yyyy):");
            dOB = scanner.nextLine();
        } while (!Regex.dOBValidate(dOB));
        return dOB;
    }

    public String inputGender() {
        String gender;
        do {
            System.out.println("Enter gender of customer:");
            gender = scanner.nextLine();
        } while (!Regex.genderValidate(gender));
        return gender;
    }

    public String inputIdCard() {
        String idCard;
        do {
            System.out.println("Enter id card of customer:");
            idCard = scanner.nextLine();
        } while (!Regex.idCardValidate(idCard));
        return idCard;
    }

    public String inputPhoneNumber() {
        String phoneNumber;
        do {
            System.out.println("Enter phone number of customer:");
            phoneNumber = scanner.nextLine();
        } while (!Regex.phoneNumberValidate(phoneNumber));
        return phoneNumber;
    }

    public String inputEmail() {
        String email;
        do {
            System.out.println("Enter email of customer:");
            email = scanner.nextLine();
        } while (!Regex.emailValidate(email));
        return email;
    }

    public String inputTypeOfCustomer() {
        String typeOfCustomer = null;
        System.out.println("Enter type of customer:");
        System.out.println("1. Diamond");
        System.out.println("2. Platinum");
        System.out.println("3. Gold");
        System.out.println("4. Silver");
        System.out.println("5. Member");
        int choice;
        while (true) {
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    typeOfCustomer = "Diamond";
                    break;
                case 2:
                    typeOfCustomer = "Platinum";
                    break;
                case 3:
                    typeOfCustomer = "Gold";
                    break;
                case 4:
                    typeOfCustomer = "Silver";
                    break;
                case 5:
                    typeOfCustomer = "Member";
                    break;
                default:
                    System.out.println("Try again!");
            }
            break;
        }
        return typeOfCustomer;
    }

    public String inputAddress() {
        System.out.println("Enter address of customer");
        String address = scanner.nextLine();
        return address;
    }
}
