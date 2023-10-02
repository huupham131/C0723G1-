package case_study.service;

import case_study.model.facility.Facility;

import java.util.List;

public interface IFacilityService<E> extends IFuramaService<E> {
    List<Facility> displayListMaintenance();

    @Override
    void add(E e);

    @Override
    void delete(String id);

    @Override
    List<E> display();
}
