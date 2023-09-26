package ss17_io_binary_file_serialization.bai_tap.productmanagement.service.impl;

import ss17_io_binary_file_serialization.bai_tap.productmanagement.model.Product;
import ss17_io_binary_file_serialization.bai_tap.productmanagement.repository.IProductRepository;
import ss17_io_binary_file_serialization.bai_tap.productmanagement.repository.impl.ProductRepositoryImpl;
import ss17_io_binary_file_serialization.bai_tap.productmanagement.service.IProductService;

import java.util.List;

public class ProductServiceImpl implements IProductService {
    private final IProductRepository productRepository = new ProductRepositoryImpl();

    @Override
    public void createProduct(Product product) {
        productRepository.createProduct(product);
    }

    @Override
    public List<Product> getProducts() {
        return productRepository.getProducts();
    }

    @Override
    public Product getProductDetail(int id) {
        return productRepository.getProductDetail(id);
    }
}
