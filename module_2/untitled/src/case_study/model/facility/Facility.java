package case_study.model.facility;

public abstract class Facility {
    private int serviceCode;
    private String serviceName;
    private int acreage;
    private int price;
    private int maxPerson;
    private String rentalType;
    public Facility(){
    }

    public Facility(int serviceCode, String serviceName, int acreage, int price, int maxPerson, String rentalType) {
        this.serviceCode = serviceCode;
        this.serviceName = serviceName;
        this.acreage = acreage;
        this.price = price;
        this.maxPerson = maxPerson;
        this.rentalType = rentalType;
    }

    public int getServiceCode() {
        return serviceCode;
    }

    public void setServiceCode(int serviceCode) {
        this.serviceCode = serviceCode;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public int getAcreage() {
        return acreage;
    }

    public void setAcreage(int acreage) {
        this.acreage = acreage;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getMaxPerson() {
        return maxPerson;
    }

    public void setMaxPerson(int maxPerson) {
        this.maxPerson = maxPerson;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }

    @Override
    public String toString() {
        return "Furama{" +
                "serviceCode=" + serviceCode +
                ", serviceName='" + serviceName + '\'' +
                ", acreage=" + acreage +
                ", price=" + price +
                ", maxPerson=" + maxPerson +
                ", rentalType='" + rentalType + '\'' +
                '}';
    }
}
