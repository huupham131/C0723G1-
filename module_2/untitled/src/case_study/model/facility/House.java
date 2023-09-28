package case_study.model.facility;

public class House extends Facility {
    private String typeOfRoom;
    private int numberOfFloors;
    public House(){

    }

    public House(String typeOfRoom, int numberOfFloors) {
        this.typeOfRoom = typeOfRoom;
        this.numberOfFloors = numberOfFloors;
    }

    public House(String serviceCode, String serviceName, double acreage, double price, int maxPerson, String rentalType, String typeOfRoom, int numberOfFloors) {
        super(serviceCode, serviceName, acreage, price, maxPerson, rentalType);
        this.typeOfRoom = typeOfRoom;
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public String toString() {
        return "House{" +
                "typeOfRoom='" + typeOfRoom + '\'' +
                ", numberOfFloors=" + numberOfFloors +
                '}';
    }
}
