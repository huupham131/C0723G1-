package com.example.repository;

import com.example.model.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepositoryImpl implements IProductRepository {
    private static List<Product> productList = new ArrayList<>();

    static {
        productList.add(new Product(1, "Iphone 15", "Pink", "Apple"));
        productList.add(new Product(2, "Iphone 14 Pro max", "Purple", "Apple"));
        productList.add(new Product(3, "SamSung S22 Ultra", "Red", "SamSung"));
        productList.add(new Product(4, "SamSung S23", "White", "SamSung"));
    }

    @Override
    public List<Product> getAll() {
        return productList;
    }

    @Override
    public void createNew(Product product) {
        productList.add(product);
    }

    @Override
    public void update(int id, Product product) {
        for (Product product1 : productList) {
            if (product1.getId() == id) {
                product1.setName(product.getName());
                product1.setDescription(product.getDescription());
                product1.setManufacturer(product.getManufacturer());
                break;
            }
        }
    }

    @Override
    public void delete(int id) {
        for (Product product1 : productList) {
            if (product1.getId() == id) {
                productList.remove(product1);
                break;
            }
        }
    }

    @Override
    public Product getProduct(int id) {
        for (Product product1 : productList) {
            if (product1.getId() == id) {
                return product1;
            }
        }
        return null;
    }

    @Override
    public List<Product> searchByName(String name) {
        List<Product> products =new ArrayList<>();
        for (Product product1 : productList) {
            if (product1.getName().contains(name)) {
                products.add(product1);
            }
        }
        return products;
    }
}
