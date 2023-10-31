package com.example.productmanagement.service.impl;

import com.example.productmanagement.model.Product;
import com.example.productmanagement.repository.IProductRepository;
import com.example.productmanagement.repository.impl.ProductRepository;
import com.example.productmanagement.service.IProductService;

import java.util.List;

public class ProductService implements IProductService {
    private final IProductRepository productRepository = new ProductRepository();

    @Override
    public List<Product> getAll() {
        return productRepository.getAll();
    }

    @Override
    public void save(Product product) {
        productRepository.save(product);
    }

    @Override
    public void update(Product customer) {
        productRepository.update(customer);
    }

    @Override
    public void remove(int id) {
        productRepository.remove(id);
    }

    @Override
    public Product productDetail(int id) {
        return productRepository.productDetail(id);
    }

    @Override
    public List<Product> findByName(String name) {
        return productRepository.findByName(name);
    }
}
