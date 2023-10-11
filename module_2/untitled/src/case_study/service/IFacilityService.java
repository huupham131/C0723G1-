package case_study.service;

import case_study.model.facility.Facility;

import java.util.List;

public interface IFacilityService extends IFuramaService<Facility> {
    List<Facility> displayListMaintenance();

}
