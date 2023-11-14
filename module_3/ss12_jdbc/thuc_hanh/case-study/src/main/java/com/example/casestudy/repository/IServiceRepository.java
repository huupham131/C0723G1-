package com.example.casestudy.repository;


import com.example.casestudy.model.Service;

import java.sql.SQLException;
import java.util.List;

public interface IServiceRepository {
    public void insertService(Service service) throws SQLException;

    public Service selectService(int id);

    public List<Service> selectAllService();

    public boolean deleteService(int id) throws SQLException;

    public boolean updateService(Service service) throws SQLException;
    List<Service> searchByName(String name);

}
