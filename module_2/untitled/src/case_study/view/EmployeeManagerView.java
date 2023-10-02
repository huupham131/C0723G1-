package case_study.view;

import case_study.controller.EmployeeController;
import case_study.model.person.Employee;
import case_study.util.Regex;

import java.time.format.DateTimeParseException;
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
                if (checkId(id)) {
                    Employee employee = new Employee();
                    employee.setIdEmployee(id);
                    employee.setName(inputName());
                    employee.setDateOfBirth(inputDayOfBirth());
                    employee.setGender(inputGender());
                    employee.setIdCard(inputIdCard());
                    employee.setPhoneNumber(inputPhoneNumber());
                    employee.setEmail(inputEmail());
                    employee.setAcademicLevel(inputAcademicLevel());
                    employee.setJobPosition(inputJobPosition());
                    employee.setSalary(inputSalary());
                    employeeController.edit(employee);
                } else {
                    System.out.println("Id not found");
                }
                break;
            case 4:
                System.out.println("Enter id:");
                String idDelete = scanner.nextLine();
                if (checkId(idDelete)) {
                    employeeController.delete(idDelete);
                } else {
                    System.out.println("Id not found");
                }
                break;
            case 5:
                System.out.println("Enter name:");
                String name = scanner.nextLine();
                System.out.println(employeeController.searchByName(name));
                break;
            case 6:
                break;
        }
    }
public void employeeMenu(){
    int temp;
        do{
            displayEmployeeMenu();
            temp = inputOption();
            handleEmployeeManagementOption(temp);
        }while (temp!=6);
}
    public Employee inputEmployee() {
        Employee employee = new Employee();
        employee.setIdEmployee(inputId());
        employee.setName(inputName());
        employee.setDateOfBirth(inputDayOfBirth());
        employee.setGender(inputGender());
        employee.setIdCard(inputIdCard());
        employee.setPhoneNumber(inputPhoneNumber());
        employee.setEmail(inputEmail());
        employee.setAcademicLevel(inputAcademicLevel());
        employee.setJobPosition(inputJobPosition());
        employee.setSalary(inputSalary());
        return employee;
    }

    public boolean checkId(String id) {
        for (Employee employee : employeeController.display()) {
            if (employee.getIdEmployee().equals(id)) {
                return true;
            }
        }
        return false;
    }


    public String inputId() {
        String id;
        do {
            System.out.println("Enter id of employee(NV-YYYY):");
            id = scanner.nextLine();
            if (checkId(id)) {
                System.out.println("Id already exists. Please enter id again:");
            }
        } while (!Regex.validate(id) || checkId(id));
        return id;
    }

    public String inputName() {
        String name;
        do {
            System.out.println("Enter name of employee:");
            name = scanner.nextLine();
        } while (!Regex.NameValidate(name));
        return name;
    }

    public String inputDayOfBirth() {
        String dOB = null;
        boolean check;
        do {
            check = false;
            try {
                System.out.println("Enter day of birth of employee (dd/mm/yyyy):");
                dOB = scanner.nextLine();
                if(Regex.is18YearsOld(dOB)){
                    check = true;
                }else{
                    System.out.println("Age of employee must greater than 18 year old");
                }
            } catch (DateTimeParseException e){
                System.out.println("Day of birth format is dd/mm/yyyy");
            }

        } while (!Regex.dOBValidate(dOB) || !check);
        return dOB;
    }

    public String inputGender() {
        String gender;
        do {
            System.out.println("Enter gender of employee:");
            gender = scanner.nextLine();
        } while (!Regex.genderValidate(gender));
        return gender;
    }

    public String inputIdCard() {
        String idCard;
        do {
            System.out.println("Enter id card of employee:");
            idCard = scanner.nextLine();
        } while (!Regex.idCardValidate(idCard));
        return idCard;
    }

    public String inputPhoneNumber() {
        String phoneNumber;
        do {
            System.out.println("Enter phone number of employee:");
            phoneNumber = scanner.nextLine();
        } while (!Regex.phoneNumberValidate(phoneNumber));
        return phoneNumber;
    }

    public String inputEmail() {
        String email;
        do {
            System.out.println("Enter email of employee:");
            email = scanner.nextLine();
        } while (!Regex.emailValidate(email));
        return email;
    }

    public String inputSalary() {
        String salary;
        do {
            System.out.println("Enter salary of employee:");
            salary = scanner.nextLine();
        } while (!Regex.salaryValidate(salary));
        return salary;
    }

    public String inputAcademicLevel() {
        String academicLevel = null;
        System.out.println("Enter academicLevel of employee:");
        System.out.println("1. Intermediate");
        System.out.println("2. College");
        System.out.println("3. University");
        System.out.println("4. Postgraduate");
        int choice;
        while (true) {
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    academicLevel = "Intermediate";
                    break;
                case 2:
                    academicLevel = "College";
                    break;
                case 3:
                    academicLevel = "University";
                    break;
                case 4:
                    academicLevel = "Postgraduate";
                    break;
                default:
                    System.out.println("Try again!");
            }
            break;
        }
        return academicLevel;
    }

    public String inputJobPosition() {
        String jobPosition = null;
        System.out.println("Enter job position of employee:");
        System.out.println("1. Receptionist");
        System.out.println("2. Waiter");
        System.out.println("3. Expert");
        System.out.println("4. Monitor");
        System.out.println("5. Manager");
        System.out.println("6. General manager");
        int choice;
        while (true) {
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    jobPosition = "Receptionist";
                    break;
                case 2:
                    jobPosition = "Waiter";
                    break;
                case 3:
                    jobPosition = "Expert";
                    break;
                case 4:
                    jobPosition = "Monitor";
                    break;
                case 5:
                    jobPosition = "Manager";
                    break;
                case 6:
                    jobPosition = "General manager";
                    break;
                default:
                    System.out.println("Try again!");
            }
            break;
        }
        return jobPosition;
    }
}
