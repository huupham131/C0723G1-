package case_study.service.impl;

import case_study.model.person.Customer;
import case_study.repository.IPersonRepository;
import case_study.repository.impl.CustomerRepositoryImpl;
import case_study.service.IPersonService;

import java.util.List;

public class CustomerServiceImpl implements IPersonService<Customer> {
    private final IPersonRepository<Customer> customerRepository = new CustomerRepositoryImpl();

    @Override
    public void add(Customer customer) {
        customerRepository.add(customer);
    }

    @Override
    public void delete(String id) {
        customerRepository.delete(id);
    }

    @Override
    public List<Customer> display() {
        return customerRepository.display();
    }

    @Override
    public void edit(Customer customer) {
        customerRepository.edit(customer);
    }

    @Override
    public List<Customer> searchByName(String name) {
        return customerRepository.searchByName(name);
    }
}
