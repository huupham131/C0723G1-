package com.example.repository;

import com.example.model.Product;

import java.util.List;

public interface IProductRepository {
    List<Product> getAll();
    void createNew(Product product);
    void update(int id, Product product);
    void delete(int id);
    Product getProduct(int id);
    List<Product> searchByName(String name);
}
