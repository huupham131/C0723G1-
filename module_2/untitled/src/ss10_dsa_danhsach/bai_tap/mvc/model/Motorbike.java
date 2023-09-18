package ss10_dsa_danhsach.bai_tap.mvc.model;

public class Motorbike extends Vehicle {
    private int wattage;

    public Motorbike() {
    }

    public Motorbike(int wattage) {
        this.wattage = wattage;
    }

    public Motorbike(String licensePlates, Manufacturer manufacturer, int yearOfManufacture, String owner, int wattage) {
        super(licensePlates, manufacturer, yearOfManufacture, owner);
        this.wattage = wattage;
    }

    public int getWattage() {
        return wattage;
    }

    public void setWattage(int wattage) {
        this.wattage = wattage;
    }

    @Override
    public String toString() {
        return "Motobike{" + super.toString() +
                "wattage=" + wattage +
                '}';
    }
}
