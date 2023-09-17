package ss10_dsa_danhsach.bai_tap.mvc.service;

import ss10_dsa_danhsach.bai_tap.mvc.model.Car;
import ss10_dsa_danhsach.bai_tap.mvc.model.Vehicle;

import java.util.List;

public interface IVehicleService<E> {
    void addVehicle(E e);

    void displayVehicle();

    void removeVehicle(E e);

    E getVehicleDetail(int id);
    boolean isLicensePlates(String licensePlates);
    List<E> getAllVehicles();
}
