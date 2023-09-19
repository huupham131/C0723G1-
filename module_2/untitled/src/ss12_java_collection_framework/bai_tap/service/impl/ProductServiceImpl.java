package ss12_java_collection_framework.bai_tap.service.impl;

import ss12_java_collection_framework.bai_tap.common.SortDown;
import ss12_java_collection_framework.bai_tap.model.Product;
import ss12_java_collection_framework.bai_tap.repository.IProductRepository;
import ss12_java_collection_framework.bai_tap.repository.impl.ProductRepositoryImpl;
import ss12_java_collection_framework.bai_tap.service.IProductService;

import java.util.ArrayList;

public class ProductServiceImpl implements IProductService {
    private final IProductRepository productRepository = new ProductRepositoryImpl();

    @Override
    public void createProduct(Product product) {
        productRepository.createProduct(product);
    }

    @Override
    public void displayProduct() {
        productRepository.displayProduct();
    }

    @Override
    public Product getProductDetail(String brandName) {
        for (Product product1 : productRepository.getAllProduct()) {
            if (product1.getBrandName().equals(brandName)) {
                return product1;
            }
        }
        return null;
    }

    @Override
    public void updateProduct(Product product) {
        productRepository.updateProduct(product);
    }

    @Override
    public void removeProduct(int id) {
        productRepository.removeProduct(id);
    }

    @Override
    public ArrayList<Product> getAllProduct() {
        return productRepository.getAllProduct();
    }

    @Override
    public ArrayList<Product> sortUpByPrice() {
        return productRepository.sortUpByPrice();
    }

    @Override
    public ArrayList<Product> sortDownByPrice() {
        return productRepository.sortDownByPrice();
    }
}
