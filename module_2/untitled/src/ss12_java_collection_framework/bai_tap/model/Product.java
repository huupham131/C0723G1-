package ss12_java_collection_framework.bai_tap.model;

public class Product {
    private int id;
    private String brandName;
    private int price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Product(int id, String brandName, int price) {
        this.id = id;
        this.brandName = brandName;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", brandName='" + brandName + '\'' +
                ", price=" + price +
                '}';
    }
}
