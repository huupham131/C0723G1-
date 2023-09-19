package ss12_java_collection_framework.bai_tap.service;

import ss12_java_collection_framework.bai_tap.model.Product;

import java.util.ArrayList;

public interface IProductService {
    void createProduct(Product product);

    void displayProduct();

    Product getProductDetail(String brandName);

    void updateProduct(Product product);

    void removeProduct(int id);

    ArrayList<Product> getAllProduct();
    ArrayList<Product> sortUpByPrice();
    ArrayList<Product> sortDownByPrice();
}
