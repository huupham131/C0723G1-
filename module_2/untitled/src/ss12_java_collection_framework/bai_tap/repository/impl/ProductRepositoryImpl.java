package ss12_java_collection_framework.bai_tap.repository.impl;

import ss12_java_collection_framework.bai_tap.common.SortDown;
import ss12_java_collection_framework.bai_tap.common.SortUp;
import ss12_java_collection_framework.bai_tap.model.Product;
import ss12_java_collection_framework.bai_tap.repository.IProductRepository;

import java.util.ArrayList;

public class ProductRepositoryImpl implements IProductRepository {
    private static ArrayList<Product> products = new ArrayList<>();

    static {
        products.add(0, new Product(1, "Apple", 1000));
        products.add(1, new Product(2, "SamSung", 900));
    }

    @Override
    public void createProduct(Product product) {
        products.add(product);
    }

    @Override
    public void displayProduct() {
        for (Product product : products) {
            System.out.println(products.toString());
        }
    }

    @Override
    public Product getProductDetail(String brandName) {
        for (Product product1 : products) {
            if (product1.getBrandName().equals(brandName)) {
                return product1;
            }
        }
        return null;
    }

    @Override
    public void updateProduct(int id, Product product) {
        products.set(id, product);
    }

    @Override
    public void removeProduct(int id) {
        products.remove(id);
    }

    @Override
    public ArrayList<Product> getAllProduct() {
        return products;
    }

    @Override
    public ArrayList<Product> sortUpByPrice() {
        products.sort(new SortUp());
        return products;
    }

    @Override
    public ArrayList<Product> sortDownByPrice() {
        products.sort(new SortDown());
        return products;
    }
}
