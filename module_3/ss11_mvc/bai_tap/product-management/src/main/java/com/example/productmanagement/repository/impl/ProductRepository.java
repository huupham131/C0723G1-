package com.example.productmanagement.repository.impl;

import com.example.productmanagement.model.Product;
import com.example.productmanagement.repository.IProductRepository;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductRepository {
    private static List<Product> productList = new ArrayList<>();

    static {
        productList.add(new Product(1, "Iphone 15", 20000, "Black", "Apple"));
        productList.add(new Product(2, "Iphone 14 pro max", 19000, "White", "Apple"));
        productList.add(new Product(3, "Samsung A2", 2000, "Black", "Apple"));
        productList.add(new Product(4, "Sony Xperia", 10000, "Pink", "Sony"));
    }

    @Override
    public List<Product> getAll() {
        return productList;
    }

    @Override
    public void save(Product product) {
        productList.add(product);
    }

    @Override
    public void update(Product product) {
        for (Product product1 : productList) {
            if (product1.getId() == product.getId()) {
                product1.setName(product.getName());
                product1.setPrice(product.getPrice());
                product1.setDescription(product.getDescription());
                product1.setManufacturer(product.getManufacturer());
            }
        }
    }

    @Override
    public void remove(int id) {
        for (Product product : productList) {
            if (product.getId() == id) {
                productList.remove(product);
                break;
            }
        }
    }

    @Override
    public Product productDetail(int id) {
        for (Product product: productList){
            if(product.getId()==id){
                return product;
            }
        }
        return null;
    }

    @Override
    public List<Product> findByName(String name) {
        List<Product> products = new ArrayList<>();
        for (Product product: productList){
            if(product.getName().contains(name)){
                products.add(product);
            }
        }
        return products;
    }
}
