package ss10_dsa_danhsach.bai_tap.mvc.model;

public class Manufacturer {
    private int id;
    private String brand;
    private String country;

    public Manufacturer(int id, String brand, String country) {
        this.id = id;
        this.brand = brand;
        this.country = country;
    }

    @Override
    public String toString() {
        return "Manufacturer{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
