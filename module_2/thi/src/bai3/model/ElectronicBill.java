package bai3.model;

public class ElectronicBill {
    private String idBill;
    private String nameCustomer;
    private String typeOfCustomer;
    private int electricUsed;
    public ElectronicBill(){

    }

    public ElectronicBill(String idBill, String nameCustomer, String typeOfCustomer, int electricUsed) {
        this.idBill = idBill;
        this.nameCustomer = nameCustomer;
        this.typeOfCustomer = typeOfCustomer;
        this.electricUsed = electricUsed;
    }

    public String getIdBill() {
        return idBill;
    }

    public void setIdBill(String idBill) {
        this.idBill = idBill;
    }

    public String getNameCustomer() {
        return nameCustomer;
    }

    public void setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
    }

    public String getTypeOfCustomer() {
        return typeOfCustomer;
    }

    public void setTypeOfCustomer(String typeOfCustomer) {
        this.typeOfCustomer = typeOfCustomer;
    }

    public int getElectricUsed() {
        return electricUsed;
    }

    public void setElectricUsed(int electricUsed) {
        this.electricUsed = electricUsed;
    }

    @Override
    public String toString() {
        return "ElectronicBill{" +
                "idBill='" + idBill + '\'' +
                ", nameCustomer='" + nameCustomer + '\'' +
                ", typeOfCustomer='" + typeOfCustomer + '\'' +
                ", electricUsed=" + electricUsed +
                '}'+ " total"+electricUsed*2500 + "\n";
    }
}
