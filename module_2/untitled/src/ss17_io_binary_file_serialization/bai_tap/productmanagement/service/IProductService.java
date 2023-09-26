package ss17_io_binary_file_serialization.bai_tap.productmanagement.service;

import ss17_io_binary_file_serialization.bai_tap.productmanagement.model.Product;

import java.util.List;

public interface IProductService {
    void createProduct(Product product);

    List<Product> getProducts();

    Product getProductDetail(int id);
}
