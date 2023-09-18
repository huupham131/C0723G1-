package ss10_dsa_danhsach.bai_tap.mvc.controller;

import ss10_dsa_danhsach.bai_tap.mvc.model.Vehicle;
import ss10_dsa_danhsach.bai_tap.mvc.service.IVehicleService;
import ss10_dsa_danhsach.bai_tap.mvc.service.imple.VehicleServiceImpl;

import java.util.ArrayList;

public class VehicleController<E extends Vehicle> {
    private final IVehicleService<E> vehicleService = new VehicleServiceImpl<>();

    public void addVehicle(E e) {
        vehicleService.addVehicle(e);
    }

    public void displayVehicle() {
        vehicleService.displayVehicle();
    }


    public void removeVehicle(E e) {
        vehicleService.removeVehicle(e);
    }


    public E getVehicleDetail(int id) {
        return vehicleService.getVehicleDetail(id);
    }
    public boolean isLicensePlates(String licensePlates) {
        return vehicleService.isLicensePlates(licensePlates);
    }
    public ArrayList<E> getAllVehicles(){
        return vehicleService.getAllVehicles();
    }
}
