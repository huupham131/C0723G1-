package ss10_dsa_danhsach.bai_tap.mvc.model;

public class Truck extends Vehicle {
    private int payloads;

    public Truck() {
    }

    public Truck(int payloads) {
        this.payloads = payloads;
    }

    public Truck(String licensePlates, String brandName, int yearOfManufacture, String owner, int payloads) {
        super(licensePlates, brandName, yearOfManufacture, owner);
        this.payloads = payloads;
    }

    public int getPayloads() {
        return payloads;
    }

    public void setPayloads(int payloads) {
        this.payloads = payloads;
    }

    @Override
    public String toString() {
        return "Truck{" + super.toString()+
                "payloads=" + payloads +
                '}';
    }
}
