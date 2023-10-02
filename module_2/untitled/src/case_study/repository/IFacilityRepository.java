package case_study.repository;

import case_study.model.facility.Facility;

import java.util.List;

public interface IFacilityRepository extends IFuramaRepository<Facility>{
    List<Facility> displayListMaintenance();
}
