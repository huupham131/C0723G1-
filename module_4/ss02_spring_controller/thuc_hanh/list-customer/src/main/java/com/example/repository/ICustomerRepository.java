package com.example.repository;

import com.example.model.Customer;

import java.util.List;

public interface ICustomerRepository {
    List<Customer> findAll();

    Customer findById(Long id);

    void save(Customer customer);
}
