package case_study.model.facility;

public class Villa extends Facility {
    private int poolArea;
    private String typeOfRoom;
    private int numberOfFloors;
    public Villa(){
    }

    public Villa(int serviceCode, String serviceName, int acreage, int price, int maxPerson, String rentalType, int poolArea, String typeOfRoom, int numberOfFloors) {
        super(serviceCode, serviceName, acreage, price, maxPerson, rentalType);
        this.poolArea = poolArea;
        this.typeOfRoom = typeOfRoom;
        this.numberOfFloors = numberOfFloors;
    }

    public int getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(int poolArea) {
        this.poolArea = poolArea;
    }

    public String getTypeOfRoom() {
        return typeOfRoom;
    }

    public void setTypeOfRoom(String typeOfRoom) {
        this.typeOfRoom = typeOfRoom;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public String toString() {
        return "Villa{" +
                "poolArea=" + poolArea +
                ", typeOfRoom='" + typeOfRoom + '\'' +
                ", numberOfFloors=" + numberOfFloors +
                '}';
    }
}
