package com.example.usermanager.repository;

import com.example.usermanager.model.User;

import java.sql.SQLException;
import java.util.List;

public interface IUserRepository {
     void insertUser(User user);

     User selectUser(int id);

     List<User> getAllUsers();

     boolean deleteUser(int id);

     boolean updateUser(User user);
     List<User> searchByCountry(String country);
     List<User> orderByName();
}
