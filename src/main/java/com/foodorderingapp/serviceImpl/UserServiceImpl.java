package com.foodorderingapp.serviceImpl;

import com.foodorderingapp.dao.UserDAO;
import com.foodorderingapp.model.User;
import com.foodorderingapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDAO userDAO;

    public void addUser(User user) {

        userDAO.addUser(user);

    }

    public List<User> getUsers() {

       return userDAO.getUsers();
    }

    public User getUserByEmail(String email) {

       return null;
    }

    public User verifyUser(User user) {
        User user1=userDAO.getUserByEmailAndPassword(user);

        User user2=new User();
        user2.setUserId(user1.getUserId());
        user2.setFirstName(user1.getFirstName());
        user2.setUserRole(user1.getUserRole());


        if(user1==null){

            return null;

        }else{

            return user2;
        }
    }
}
