package ss10_dsa_danhsach.bai_tap.mvc.repository;


import ss10_dsa_danhsach.bai_tap.mvc.model.Vehicle;

import java.util.ArrayList;
import java.util.List;

public interface IVehicleRepository<E> {
    void addVehicle(E e);

    void displayVehicle();

    void removeVehicle(E e);

    E getVehicleDetail(int id);
    List<E> getAllVehicles();
}
