package ss10_dsa_danhsach.bai_tap.mvc.repository;


import ss10_dsa_danhsach.bai_tap.mvc.model.Vehicle;

public interface IVehicleRepository<E> {
    void addVehicle(E e);
   void displayVehicle();
   void removeVehicle(int id);
   E getVehicleDetail(int id);
}
