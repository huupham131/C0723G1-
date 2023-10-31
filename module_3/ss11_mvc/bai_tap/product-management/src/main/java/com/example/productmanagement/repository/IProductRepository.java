package com.example.productmanagement.repository;

import com.example.productmanagement.model.Product;

import java.util.List;

public interface IProductRepository {
    List<Product> getAll();
    void save(Product product);
    void update(Product customer);
    void remove(int id);
    Product productDetail(int id);
    List<Product> findByName(String name);
}
