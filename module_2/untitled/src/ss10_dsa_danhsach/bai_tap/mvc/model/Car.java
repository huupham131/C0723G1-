package ss10_dsa_danhsach.bai_tap.mvc.model;

public class Car extends Vehicle {
    private int numberOfSeats;
    private String carType;

    public Car() {
    }

    public Car(int numberOfSeats, String carType) {
        this.numberOfSeats = numberOfSeats;
        this.carType = carType;
    }

    public Car(String licensePlates, Manufacturer manufacturer, int yearOfManufacture, String owner, int numberOfSeats, String carType) {
        super(licensePlates, manufacturer, yearOfManufacture, owner);
        this.numberOfSeats = numberOfSeats;
        this.carType = carType;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    @Override
    public String toString() {
        return "Car{" + super.toString() +
                "numberOfSeats=" + numberOfSeats +
                ", carType='" + carType + '\'' +
                '}';
    }
}
