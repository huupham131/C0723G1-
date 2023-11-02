package com.example.usermanager.service;

import com.example.usermanager.model.User;

import java.sql.SQLException;
import java.util.List;

public interface IUserService {
    void insertUser(User user);

    User selectUser(int id);

    List<User> getAllUsers();

    boolean deleteUser(int id);

    boolean updateUser(User user);
    List<User> searchByCountry(String country);
    List<User> orderByName();
    User getUserById(int id);

    void insertUserStore(User user) throws SQLException;
    void addUserTransaction(User user, List<Integer> permission);
     void insertUpdateWithoutTransaction();
     void insertUpdateUseTransaction();
    List<User> getAllUsersBySP();
    boolean updateUserBySP(User user);
    boolean deleteUserBySP(int id);
    void deleteUserTransaction();
}
