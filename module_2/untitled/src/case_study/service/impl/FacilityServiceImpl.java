package case_study.service.impl;

import case_study.model.facility.Facility;
import case_study.repository.IFacilityRepository;
import case_study.repository.impl.FacilityRepositoryImpl;
import case_study.service.IFacilityService;

import java.util.List;

public class FacilityServiceImpl implements IFacilityService {
    private final IFacilityRepository facilityRepository = new FacilityRepositoryImpl();

    @Override
    public List<Facility> displayListMaintenance() {
        return facilityRepository.displayListMaintenance();
    }

    @Override
    public void add(Facility facility) {
        facilityRepository.add(facility);
    }

    @Override
    public void delete(String id) {
        facilityRepository.delete(id);
    }

    @Override
    public List<Facility> display() {
        return facilityRepository.display();
    }
}
