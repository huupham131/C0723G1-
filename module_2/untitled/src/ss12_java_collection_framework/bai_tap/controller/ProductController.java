package ss12_java_collection_framework.bai_tap.controller;

import ss12_java_collection_framework.bai_tap.model.Product;
import ss12_java_collection_framework.bai_tap.service.IProductService;
import ss12_java_collection_framework.bai_tap.service.impl.ProductServiceImpl;

import java.util.ArrayList;

public class ProductController {
    private final IProductService productService = new ProductServiceImpl();
    public void createProduct(Product product) {
        productService.createProduct(product);
    }
    public void displayProduct() {
        productService.displayProduct();
    }

    public Product getProductDetail(String brandName) {
        for (Product product1 : productService.getAllProduct()) {
            if (product1.getBrandName().equals(brandName)) {
                return product1;
            }
        }
        return null;
    }
    public void updateProduct(int id, Product product) {
        productService.updateProduct(id, product);
    }

    public void removeProduct(int id) {
        productService.removeProduct(id);
    }

    public ArrayList<Product> getAllProduct() {
        return productService.getAllProduct();
    }
    public ArrayList<Product> sortUpByPrice() {
        return productService.sortUpByPrice();
    }
    public ArrayList<Product> sortDownByPrice() {
        return productService.sortDownByPrice();
    }
}
