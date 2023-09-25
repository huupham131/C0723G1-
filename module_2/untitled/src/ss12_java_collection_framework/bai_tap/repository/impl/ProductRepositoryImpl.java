package ss12_java_collection_framework.bai_tap.repository.impl;

import ss12_java_collection_framework.bai_tap.common.SortDown;
import ss12_java_collection_framework.bai_tap.common.SortUp;
import ss12_java_collection_framework.bai_tap.model.Product;
import ss12_java_collection_framework.bai_tap.repository.IProductRepository;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductRepositoryImpl implements IProductRepository {
    private static ArrayList<Product> products = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

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
        System.out.format("%-5s %-15s %-10s\n", "ID", "Tên Hãng", "Giá");
        for (Product product : products) {
            System.out.format("%-5s %-15s %-10s\n", product.getId(), product.getBrandName(), product.getPrice());
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
    public void updateProduct(Product product) {
        for (Product product1 : products) {
            if (product1.getId() == product.getId()) {
                product1.setBrandName(product.getBrandName());
                product1.setPrice(product.getPrice());
            }
        }
    }

    @Override
    public void removeProduct(int id) {
        for(Product product: products){
            if(product.getId()==id){
                products.remove(id);
            }
        }
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
