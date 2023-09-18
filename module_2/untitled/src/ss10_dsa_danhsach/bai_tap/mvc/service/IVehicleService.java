package ss10_dsa_danhsach.bai_tap.mvc.service;


import java.util.ArrayList;

public interface IVehicleService<E> {
    void addVehicle(E e);

    void displayVehicle();

    void removeVehicle(E e);

    E getVehicleDetail(int id);

    boolean isLicensePlates(String licensePlates);

    ArrayList<E> getAllVehicles();
}
