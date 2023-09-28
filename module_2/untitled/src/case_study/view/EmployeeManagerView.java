package case_study.view;

import case_study.controller.EmployeeController;
import case_study.model.person.Employee;
import ss12_java_collection_framework.bai_tap.model.Product;

import java.util.Scanner;

public class EmployeeManagerView {
    private final EmployeeController employeeController = new EmployeeController();
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
                System.out.println(employeeController.display());
                break;
            case 2:
                employeeController.add(inputEmployee());
                break;
            case 3:
                System.out.println("Enter id:");
                String id = scanner.nextLine();
                if(checkId(id)){
                    Employee employee = new Employee();
                    employee.setIdEmployee(id);
                    System.out.println("Enter name of employee:");
                    employee.setName(scanner.nextLine());
                    System.out.println("Enter day of birth of employee:");
                    employee.setDateOfBirth(scanner.nextLine());
                    System.out.println("Enter gender of employee:");
                    employee.setGender(scanner.nextLine());
                    System.out.println("Enter id card of employee:");
                    employee.setIdCard(scanner.nextLine());
                    System.out.println("Enter phone number of employee:");
                    employee.setPhoneNumber(scanner.nextLine());
                    System.out.println("Enter email of employee:");
                    employee.setEmail(scanner.nextLine());
                    System.out.println("Enter academicLevel of employee:");
                    employee.setAcademicLevel(scanner.nextLine());
                    System.out.println("Enter jobPosition of employee:");
                    employee.setJobPosition(scanner.nextLine());
                    System.out.println("Enter salary of employee:");
                    employee.setSalary(scanner.nextLine());
                    employeeController.edit(employee);
                }else {
                    System.out.println("Id not found");
                }
                break;
            case 4:
                System.out.println("Enter id:");
                String idDelete = scanner.nextLine();
                if (checkId(idDelete)){
                    employeeController.delete(idDelete);
                }else {
                    System.out.println("Id not found");
                }
                break;
            case 5:
                System.out.println("Enter name:");
                String name = scanner.nextLine();
                System.out.println(employeeController.searchByName(name));
                break;
            case 6:
                return;
        }
    }
    public Employee inputEmployee(){
        Employee employee = new Employee();
        System.out.println("Enter id of employee:");
        employee.setIdEmployee(scanner.nextLine());
        System.out.println("Enter name of employee:");
        employee.setName(scanner.nextLine());
        System.out.println("Enter day of birth of employee:");
        employee.setDateOfBirth(scanner.nextLine());
        System.out.println("Enter gender of employee:");
        employee.setGender(scanner.nextLine());
        System.out.println("Enter id card of employee:");
        employee.setIdCard(scanner.nextLine());
        System.out.println("Enter phone number of employee:");
        employee.setPhoneNumber(scanner.nextLine());
        System.out.println("Enter email of employee:");
        employee.setEmail(scanner.nextLine());
        System.out.println("Enter academicLevel of employee:");
        employee.setAcademicLevel(scanner.nextLine());
        System.out.println("Enter jobPosition of employee:");
        employee.setJobPosition(scanner.nextLine());
        System.out.println("Enter salary of employee:");
        employee.setSalary(scanner.nextLine());
        return employee;
    }
    public boolean checkId(String id) {
        boolean check = false;
        for (Employee employee : employeeController.display()) {
            if (employee.getIdEmployee().equals(id)) {
                check = true;
            }
        }
        return check;
    }
}
