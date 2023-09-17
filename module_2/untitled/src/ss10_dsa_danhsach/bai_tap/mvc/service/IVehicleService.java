package ss10_dsa_danhsach.bai_tap.mvc.service;

import ss10_dsa_danhsach.bai_tap.mvc.model.Car;
import ss10_dsa_danhsach.bai_tap.mvc.model.Vehicle;

public interface IVehicleService<E> {
    void addVehicle(E e);
    void displayVehicle();
    void removeVehicle(int id);
    E getVehicleDetail(int id);
}
