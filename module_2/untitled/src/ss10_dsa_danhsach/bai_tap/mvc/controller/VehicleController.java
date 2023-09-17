package ss10_dsa_danhsach.bai_tap.mvc.controller;

import ss10_dsa_danhsach.bai_tap.mvc.service.IVehicleService;
import ss10_dsa_danhsach.bai_tap.mvc.service.imple.VehicleService;

public class VehicleController<E> {
    private final IVehicleService<E> vehicleService = new VehicleService<>();
    public void addVehicle(E e){
        vehicleService.addVehicle(e);
    }

    public void displayVehicle() {
        vehicleService.displayVehicle();
    }


    public void removeVehicle(int id) {
        vehicleService.removeVehicle(id);
    }


    public E getVehicleDetail(int id) {
        return vehicleService.getVehicleDetail(id);
    }
}
