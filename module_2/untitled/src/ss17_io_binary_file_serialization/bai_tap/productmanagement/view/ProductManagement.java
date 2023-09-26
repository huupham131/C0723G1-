package ss17_io_binary_file_serialization.bai_tap.productmanagement.view;

import ss17_io_binary_file_serialization.bai_tap.productmanagement.controller.ProductController;
import ss17_io_binary_file_serialization.bai_tap.productmanagement.model.Product;

import java.util.Scanner;

public class ProductManagement {
    private final ProductController productController = new ProductController();
    private final Scanner scanner = new Scanner(System.in);

    public void displayMenu() {
        System.out.println("---Product Manager Tool---");
        System.out.println("1. Create new product");
        System.out.println("2. Display all products");
        System.out.println("3. Search product");
        System.out.println("4. Exit");
    }

    public int inputOption() {
        int option = 0;
        do {
            displayMenu();
            System.out.println("Please select feature:");
            option = Integer.parseInt(scanner.nextLine());
        } while (option <= 0 || option > 5);
        return option;
    }

    public void handleProductManagementOption(int option) {
        switch (option) {
            case 1:
                productController.createProduct(inputProduct());
                break;
            case 2:
                System.out.println(productController.getProducts());
                break;
            case 3:
                System.out.println("Enter id :");
                int id = Integer.parseInt(scanner.nextLine());
                System.out.println(productController.getProductDetail(id));
                break;
            case 4:
                System.exit(1);
        }
    }

    public Product inputProduct() {
        Product product = new Product();
        System.out.println("Enter id:");
        product.setId(Integer.parseInt(scanner.nextLine()));
        System.out.println("Enter name of product:");
        product.setName(scanner.nextLine());
        System.out.println("Enter price of product:");
        product.setPrice(Double.parseDouble(scanner.nextLine()));
        System.out.println("Enter manufacturer of product:");
        product.setManufacturer(scanner.nextLine());
        System.out.println("Enter describe of product:");
        product.setDescribe(scanner.nextLine());
        return product;
    }

    public void render() {
        while (true) {
            handleProductManagementOption(inputOption());
        }
    }
}
