package case_study.view;

import case_study.controller.CustomerController;
import case_study.controller.EmployeeController;
import case_study.model.person.Customer;
import case_study.model.person.Employee;

import java.util.Scanner;

public class CustomerManagerView {
    private final CustomerController customerController = new CustomerController();
    private final Scanner scanner = new Scanner(System.in);
    public void displayCustomerMenu(){
        System.out.println("---Customer Menu---");
        System.out.println("1. Display list customers");
        System.out.println("2. Add new customer");
        System.out.println("3. Edit customer");
        System.out.println("4. Delete customer");
        System.out.println("5. Search by name customer");
        System.out.println("6. Return main menu");
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
                if(checkId(id)){
                    Customer customer = new Customer();
                    System.out.println("Enter name of customer:");
                    customer.setName(scanner.nextLine());
                    System.out.println("Enter day of birth of customer:");
                    customer.setDateOfBirth(scanner.nextLine());
                    System.out.println("Enter gender of customer:");
                    customer.setGender(scanner.nextLine());
                    System.out.println("Enter id card of customer:");
                    customer.setIdCard(scanner.nextLine());
                    System.out.println("Enter phone number of customer:");
                    customer.setPhoneNumber(scanner.nextLine());
                    System.out.println("Enter email of customer:");
                    customer.setEmail(scanner.nextLine());
                    System.out.println("Enter type of customer:");
                    customer.setTypeOfCustomer(scanner.nextLine());
                    System.out.println("Enter address of customer:");
                    customer.setAddress(scanner.nextLine());
                }
                break;
            case 4:
                System.out.println("Enter id:");
                String idDelete = scanner.nextLine();
                if (checkId(idDelete)){
                    customerController.delete(idDelete);
                }else {
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
    public Customer inputCustomer(){
        Customer customer = new Customer();
        System.out.println("Enter id of customer:");
        customer.setIdCustomer(scanner.nextLine());
        System.out.println("Enter name of customer:");
        customer.setName(scanner.nextLine());
        System.out.println("Enter day of birth of customer:");
        customer.setDateOfBirth(scanner.nextLine());
        System.out.println("Enter gender of customer:");
        customer.setGender(scanner.nextLine());
        System.out.println("Enter id card of customer:");
        customer.setIdCard(scanner.nextLine());
        System.out.println("Enter phone number of customer:");
        customer.setPhoneNumber(scanner.nextLine());
        System.out.println("Enter email of customer:");
        customer.setEmail(scanner.nextLine());
        System.out.println("Enter type of customer:");
        customer.setTypeOfCustomer(scanner.nextLine());
        System.out.println("Enter address of customer:");
        customer.setAddress(scanner.nextLine());
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
}
