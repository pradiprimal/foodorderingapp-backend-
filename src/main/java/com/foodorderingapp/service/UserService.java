package com.foodorderingapp.service;

import com.foodorderingapp.model.User;

import java.util.List;

public interface UserService {

    void addUser(User user);
    List<User> getUsers();
    // User getUserByEmail(int email);
     User getUserByEmail(String email);
     User verifyUser(User user);
}
