package com.foodorderingapp.serviceImpl;

import com.foodorderingapp.dao.UserDAO;
import com.foodorderingapp.dto.LoginDto;
import com.foodorderingapp.dto.UserDto;
import com.foodorderingapp.model.User;
import com.foodorderingapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDAO userDAO;

    public void addUser(UserDto userDto) {

        User user = new User();
        user.setFirstName(userDto.getFirstName());
        user.setMiddleName(userDto.getMiddleName());
        user.setLastName(userDto.getLastName());
        user.setContactNo(userDto.getContactNo());
        user.setUserPassword(userDto.getUserPassword());
        user.setAddress(userDto.getAddress());
        user.setEmail(userDto.getEmail());
        user.setBalance(userDto.getBalance());
        user.setRole("user");

        User user1 = userDAO.getUserByEmailId(user);

        if (user1 != null) {

            throw new IllegalArgumentException("plz rewite email");

        } else if (user1 == null) {

            userDAO.addUser(user);
        }
    }

    public List<User> getUsers() {

        return userDAO.getUsers();
    }


    public LoginDto verifyUser(LoginDto loginDto) {

        User user = new User();
        user.setEmail(loginDto.getEmail());
        user.setUserPassword(loginDto.getUserPassword());


        User user1 = userDAO.getUserByEmail(user);

        LoginDto loginDto1 = new LoginDto();
        loginDto1.setId(user1.getUserId());
        loginDto1.setFirstName(user1.getFirstName());
        loginDto1.setMiddleName(user1.getMiddleName());
        loginDto1.setLastName(user1.getLastName());
        loginDto1.setEmail(user1.getEmail());
        loginDto1.setRole(user1.getRole());
        loginDto1.setContact(user1.getContactNo());
        loginDto1.setAddress(user1.getAddress());
        loginDto1.setBalance(user1.getBalance());

        if (user1 == null) {

            throw new IllegalArgumentException("user not exits");

        } else {

            return loginDto1;
        }
    }

    public User getUser(int userId) {
        return userDAO.getUser(userId);
    }

    public void updateUser(User user, int userId) {

        User user1=userDAO.getUser(userId);
        user1.setBalance(user.getBalance());

        userDAO.updateUser(user1);

    }

}
