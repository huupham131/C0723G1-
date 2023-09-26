package ss17_io_binary_file_serialization.bai_tap.productmanagement.repository.impl;

import ss17_io_binary_file_serialization.bai_tap.productmanagement.model.Product;
import ss17_io_binary_file_serialization.bai_tap.productmanagement.repository.IProductRepository;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ProductRepositoryImpl implements IProductRepository {
    private static final String PRODUCTS_CSV_PATH = "/Users/macbook/Documents/GitHub/C0723G1-PhamThanhHuu/module_2/untitled/src/ss17_io_binary_file_serialization/bai_tap/productmanagement/data/data.csv";

    public void writeByByteStream(String pathname, List<Product> data) {
        File file = null;
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            file = new File(pathname);
            if (!file.exists()) {
                file.createNewFile();
            }
            fileOutputStream = new FileOutputStream(file);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(data);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (objectOutputStream != null) {
                    objectOutputStream.close();
                }
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        }
    }

    public List<Product> readByByteStream(String pathname) {
        File file = null;
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;
        try {
            file = new File(pathname);
            if (!file.exists()) {
                return new ArrayList<>();
            }
            fileInputStream = new FileInputStream(file);
            objectInputStream = new ObjectInputStream(fileInputStream);
            return (List<Product>) objectInputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (objectInputStream != null) {
                    objectInputStream.close();
                }
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        }
    }

    @Override
    public void createProduct(Product product) {
        List<Product> products = getProducts();
        product.setId(products.size() + 1);
        products.add(product);
        writeByByteStream(PRODUCTS_CSV_PATH, products);
    }

    @Override
    public List<Product> getProducts() {
        return readByByteStream(PRODUCTS_CSV_PATH);
    }

    @Override
    public Product getProductDetail(int id) {
        List<Product> products = getProducts();
        for (Product product : products) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }

}
