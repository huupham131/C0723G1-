package case_study.controller;

import case_study.model.person.Customer;
import case_study.model.person.Employee;
import case_study.service.IPersonService;
import case_study.service.impl.CustomerServiceImpl;
import case_study.service.impl.EmployeeServiceImpl;

import java.util.List;

public class CustomerController {
    private final IPersonService<Customer> customerService = new CustomerServiceImpl();

    public void add(Customer customer) {
        customerService.add(customer);
    }

    public void delete(String id) {
        customerService.delete(id);
    }

    public List<Customer> display() {
        return customerService.display();
    }

    public void edit(Customer customer) {
        customerService.edit(customer);
    }

    public List<Customer> searchByName(String name) {
        return customerService.searchByName(name);
    }
}
