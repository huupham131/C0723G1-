package com.example.usermanager.service;

import com.example.usermanager.model.User;

import java.util.List;

public interface IUserService {
    void insertUser(User user);

    User selectUser(int id);

    List<User> getAllUsers();

    boolean deleteUser(int id);

    boolean updateUser(User user);
    List<User> searchByCountry(String country);
    List<User> orderByName();
}
