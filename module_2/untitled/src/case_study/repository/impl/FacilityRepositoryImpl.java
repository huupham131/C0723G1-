package case_study.repository.impl;

import case_study.model.facility.Facility;
import case_study.repository.IFacilityRepository;

import java.util.*;

public class FacilityRepositoryImpl implements IFacilityRepository {
    LinkedHashMap<Facility, Integer> facilityMap = new LinkedHashMap<>();

    @Override
    public List<Facility> displayListMaintenance() {
        return null;
    }

    @Override
    public void add(Facility facility) {
        facilityMap.put(facility, 0);
    }

    @Override
    public void delete(String id) {
//        List<Facility> facilityList = display();
//        for(Facility facility1 : facilityList ){
//            if(facility1.getServiceCode().equals(id)){
//                facilityList.remove(facility1);
//            }
//        }
//        facilityList
    }

    @Override
    public List<Facility> display() {
        return facilityMap.keySet().stream().toList();
    }


}
