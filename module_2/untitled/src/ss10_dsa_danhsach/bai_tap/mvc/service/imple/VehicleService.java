package ss10_dsa_danhsach.bai_tap.mvc.service.imple;

import ss10_dsa_danhsach.bai_tap.mvc.repository.IVehicleRepository;
import ss10_dsa_danhsach.bai_tap.mvc.repository.impl.VehicleRepository;
import ss10_dsa_danhsach.bai_tap.mvc.service.IVehicleService;

public class VehicleService<E> implements IVehicleService<E> {
    private final IVehicleRepository<E> vehicleRepository = new VehicleRepository<>();

    @Override
    public void addVehicle(E e) {
        vehicleRepository.addVehicle(e);
    }

    @Override
    public void displayVehicle() {
        vehicleRepository.displayVehicle();
    }

    @Override
    public void removeVehicle(int id) {
vehicleRepository.removeVehicle(id);
    }

    @Override
    public E getVehicleDetail(int id) {
        return vehicleRepository.getVehicleDetail(id);
    }
}
