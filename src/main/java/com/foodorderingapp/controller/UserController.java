package com.foodorderingapp.controller;

import com.foodorderingapp.dto.LoginDto;
import com.foodorderingapp.dto.UserDto;
import com.foodorderingapp.model.User;
import com.foodorderingapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.Path;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    @ResponseBody
    public void addUser(@RequestBody UserDto userDto) {

        User user=new User();
        user.setFirstName(userDto.getFirstName());
        user.setMiddleName(userDto.getMiddleName());
        user.setLastName(userDto.getLastName());
        user.setContactNo(userDto.getContactNo());
        user.setUserPassword(userDto.getUserPassword());
        user.setAddress(userDto.getAddress());
        user.setEmail(userDto.getEmail());
        user.setUserRole("user");



        userService.addUser(user);

    }

    @GetMapping
    @ResponseBody
    public List<User> getUsers() {

        return userService.getUsers();
    }

    @PostMapping(value="/verify")
    @ResponseBody
    public User verifyUser(@RequestBody LoginDto loginDto){

           User user =new User();
            user.setEmail(loginDto.getEmail());
            user.setUserPassword(loginDto.getUserPassword());

            return userService.verifyUser(user);

    }
}
