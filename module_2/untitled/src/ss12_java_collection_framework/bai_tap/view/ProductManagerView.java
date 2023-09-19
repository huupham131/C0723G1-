package ss12_java_collection_framework.bai_tap.view;

import ss12_java_collection_framework.bai_tap.controller.ProductController;
import ss12_java_collection_framework.bai_tap.model.Product;

import java.util.Scanner;

public class ProductManagerView {
    private final Scanner scanner = new Scanner(System.in);
    private ProductController productController = new ProductController();

    public int inputOption() {
        int option = 0;
        do {
            displayProductManagerView();
            System.out.println("Please select feature:");
            option = Integer.parseInt(scanner.nextLine());
        } while (option <= 0 || option >= 7);
        return option;
    }

    public void displayProductManagerView() {
        System.out.println("==== Product Manager Tool ====");
        System.out.println("1. Create new product");
        System.out.println("2. Edit product");
        System.out.println("3. Delete product");
        System.out.println("4. Search product by brand name");
        System.out.println("5. Sort up price product");
        System.out.println("6. Sort down price product");
        System.out.println("7. Exit");
    }

    public void render() {
        while (true) {
            handleProductManagementOption(inputOption());
        }
    }

    public void handleProductManagementOption(int option) {
        switch (option) {
            case 1:
                inputProduct();
                break;
            case 2:
                System.out.println("Enter id of product:");
                int id = Integer.parseInt(scanner.nextLine());
                productController.updateProduct(id, inputProduct());
                break;
            case 3:
                System.out.println("Enter id of product:");
                int idDelete = Integer.parseInt(scanner.nextLine());
                productController.removeProduct(idDelete);
                break;
            case 4:
                System.out.println("Enter brand name of product:");
                String brand = scanner.nextLine();
                System.out.println(productController.getProductDetail(brand));
                break;
            case 5:
                System.out.println(productController.sortUpByPrice());
                break;
            case 6:
                System.out.println(productController.sortDownByPrice());
                break;
            case 7:
                System.exit(0);
        }
    }

    public Product inputProduct() {
        System.out.println("Enter id:");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter brand name:");
        String brand = scanner.nextLine();
        System.out.println("Enter price:");
        int price = Integer.parseInt(scanner.nextLine());
        Product newProduct = new Product(id, brand, price);
        System.out.println("Create completed!");
        return newProduct;
    }
}
