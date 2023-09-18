package ss10_dsa_danhsach.bai_tap.mvc.repository.impl;

import ss10_dsa_danhsach.bai_tap.mvc.repository.IVehicleRepository;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class VehicleRepositoryImpl<E> implements IVehicleRepository<E> {
    private ArrayList<E> vehicles = new ArrayList<>();

    @Override
    public void addVehicle(E e) {
        vehicles.add(e);
    }

    @Override
    public void displayVehicle() {
        for (E vehicle : vehicles) {
            System.out.println(vehicle.toString());
        }
    }

    @Override
    public void removeVehicle(E e) {
        vehicles.remove(e);
    }

    @Override
    public E getVehicleDetail(int id) {
        return vehicles.get(id);
    }

    @Override
    public ArrayList<E> getAllVehicles() {
        return vehicles;
    }

}