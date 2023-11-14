package com.example.usermanager.service.impl;

import com.example.usermanager.model.User;
import com.example.usermanager.repository.IUserRepository;
import com.example.usermanager.repository.impl.UserRepository;
import com.example.usermanager.service.IUserService;

import java.sql.SQLException;
import java.util.List;

public class UserService implements IUserService {
    private final IUserRepository userRepository = new UserRepository();

    @Override
    public void insertUser(User user) {
        userRepository.insertUser(user);
    }

    @Override
    public User selectUser(int id) {
        return userRepository.selectUser(id);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.getAllUsers();
    }

    @Override
    public boolean deleteUser(int id) {
        return userRepository.deleteUser(id);
    }

    @Override
    public boolean updateUser(User user) {
        return userRepository.updateUser(user);
    }

    @Override
    public List<User> searchByCountry(String country) {
        return userRepository.searchByCountry(country);
    }

    @Override
    public List<User> orderByName() {
        return userRepository.orderByName();
    }

    @Override
    public User getUserById(int id) {
        return userRepository.getUserById(id);
    }

    @Override
    public void insertUserStore(User user) throws SQLException {
        userRepository.insertUserStore(user);
    }

    @Override
    public void addUserTransaction(User user, List<Integer> permission) {
        userRepository.addUserTransaction(user,permission);
    }

    @Override
    public void insertUpdateWithoutTransaction() {
        userRepository.insertUpdateWithoutTransaction();
    }

    @Override
    public void insertUpdateUseTransaction() {
        userRepository.insertUpdateUseTransaction();
    }

    @Override
    public List<User> getAllUsersBySP() {
        return userRepository.getAllUsersBySP();
    }

    @Override
    public boolean updateUserBySP(User user) {
        return userRepository.updateUserBySP(user);
    }

    @Override
    public boolean deleteUserBySP(int id) {
        return userRepository.deleteUserBySP(id);
    }

    @Override
    public void deleteUserTransaction() {

    }
}
