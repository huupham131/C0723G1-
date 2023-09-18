package ss10_dsa_danhsach.bai_tap.mvc.service.imple;

import ss10_dsa_danhsach.bai_tap.mvc.model.Vehicle;
import ss10_dsa_danhsach.bai_tap.mvc.repository.IVehicleRepository;
import ss10_dsa_danhsach.bai_tap.mvc.repository.impl.VehicleRepositoryImpl;
import ss10_dsa_danhsach.bai_tap.mvc.service.IVehicleService;

import java.util.List;

public class VehicleServiceImpl<E extends Vehicle> implements IVehicleService<E> {
    private final IVehicleRepository<E> vehicleRepository = new VehicleRepositoryImpl<>();

    @Override
    public void addVehicle(E e) {
        vehicleRepository.addVehicle(e);
    }

    @Override
    public void displayVehicle() {
        vehicleRepository.displayVehicle();
    }

    @Override
    public void removeVehicle(E e) {
        vehicleRepository.removeVehicle(e);
    }

    @Override
    public E getVehicleDetail(int id) {
        return vehicleRepository.getVehicleDetail(id);
    }

    @Override
    public boolean isLicensePlates(String licensePlates) {
        for (E vehicle : vehicleRepository.getAllVehicles()) {
            if (vehicle.getLicensePlates().equals(licensePlates)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public List<E> getAllVehicles() {
        return vehicleRepository.getAllVehicles();
    }
}
