package com.foodorderingapp.dao;

import com.foodorderingapp.model.User;

import java.util.List;

public interface UserDAO {
     void addUser(User user);
     List<User> getUsers();
      User getUserByEmailAndPassword(User user);
}
