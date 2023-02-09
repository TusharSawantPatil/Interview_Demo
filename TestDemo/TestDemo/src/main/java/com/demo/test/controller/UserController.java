package com.demo.test.controller;

import com.demo.test.entities.User;
import com.demo.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping("/addUser")
    public User addUser(@RequestBody User user){
        return userService.saveUser(user);
    }
    @PostMapping("/addUsers")
    public List<User> addUsers(@RequestBody List<User> users){
        return userService.saveAllUsers(users);
    }
    @GetMapping("/users")
    public List<User> findAllUsers(){
        return userService.getUsers();
    }
    @GetMapping("/users/{id}")
    public User findUserById(@PathVariable int id){
        return userService.getUserById(id);
    }
    @PutMapping("/updateUser")
    public User updateUser(@RequestBody User user){
        return userService.updateUser(user);
    }
    @DeleteMapping("deleteUser/{id}")
    public String deleteUser(@PathVariable int id){
        return userService.deleteUser(id);

    }







}
