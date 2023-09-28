//package case_study.repository.impl;
//
//import case_study.model.person.Customer;
//import case_study.model.person.Employee;
//import case_study.model.person.Person;
//import case_study.repository.IPersonRepository;
//import case_study.util.FileUtil;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class PersonRepositoryImpl<E> implements IPersonRepository<E> {
//    private final String EMPLOYEE_PATH = "/Users/macbook/Documents/GitHub/C0723G1-PhamThanhHuu/module_2/untitled/src/case_study/data/employee_data.csv";
//    private final String CUSTOMER_PATH = "/Users/macbook/Documents/GitHub/C0723G1-PhamThanhHuu/module_2/untitled/src/case_study/data/customer_data.csv";
//    private final Class<E> entityType;
//
//    public PersonRepositoryImpl(Class<E> entityType) {
//        this.entityType = entityType;
//    }
//
//    @Override
//    public void edit(String id, Object o) {
//
//    }
//
//    @Override
//    public List searchByName(String name) {
//        return null;
//    }
//
//    @Override
//    public void add(E e) {
//        List<E> personList = this.display();
//        personList.add(e);
//        if (e instanceof Employee) {
//            FileUtil.writeFile(EMPLOYEE_PATH, this.convertToString(personList));
//        } else {
//            FileUtil.writeFile(CUSTOMER_PATH, this.convertToString(personList));
//        }
//    }
//
//    @Override
//    public void delete(String id) {
//
//    }
//
//    @Override
//    public List<E> display() {
//        if (entityType == Employee.class) {
//            return convertToObject(FileUtil.readFile(EMPLOYEE_PATH));
//        } else {
//            return convertToObject(FileUtil.readFile(CUSTOMER_PATH));
//        }
//    }
//
//    @Override
//    public List<String> convertToString(List<E> e) {
//        List<Person> personList = new ArrayList<>();
//        personList.add(new Employee());
//        personList.add(new Customer());
//        for (Person person : personList) {
//            if (person instanceof Customer) {
//                Customer customer = (Customer) person;
//                customer.getTypeOfCustomer();
//            } else if (person instanceof Employee) {
//                Employee employee = (Employee) person;
//                employee.getIdEmployee();
//            }
//        }
//        List<String> strings = new ArrayList<>();
//        for (E e1 : e) {
//            if (entityType == Employee.class) {
//
//            }
//        }
//        return null;
//    }
//
//    @Override
//    public List<E> convertToObject(List<String> list) {
//        List<E> personList = new ArrayList<>();
//        for (String e : list) {
//            String[] data = e.split(",");
//            if (entityType == Employee.class) {
//                personList.add((E) new Employee(data[0], data[1], data[2], data[3], data[4], data[5], data[6], data[7], data[8]));
//            } else {
//                personList.add((E) new Customer(data[0], data[1], data[2], data[3], data[4], data[5], data[6], data[7]));
//            }
//        }
//        return personList;
//    }
//}