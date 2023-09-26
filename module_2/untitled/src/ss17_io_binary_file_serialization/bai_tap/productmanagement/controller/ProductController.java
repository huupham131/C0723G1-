package ss17_io_binary_file_serialization.bai_tap.productmanagement.controller;


import ss17_io_binary_file_serialization.bai_tap.productmanagement.model.Product;
import ss17_io_binary_file_serialization.bai_tap.productmanagement.service.IProductService;
import ss17_io_binary_file_serialization.bai_tap.productmanagement.service.impl.ProductServiceImpl;

import java.util.List;

public class ProductController {
    private final IProductService productService = new ProductServiceImpl();

    public void createProduct(Product product) {
        productService.createProduct(product);
    }


    public List<Product> getProducts() {
        return productService.getProducts();
    }


    public Product getProductDetail(int id) {
        return productService.getProductDetail(id);
    }
}
