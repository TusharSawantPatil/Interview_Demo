package com.demo.test.service;

import com.demo.test.entities.User;
import com.demo.test.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User saveUser(User user){
         return userRepository.save(user);
    }
    public List<User> saveAllUsers(List<User> users){
        return userRepository.saveAll(users);
    }
    public User getUserById(int id){
        return userRepository.findById(id).orElse(null);
    }
    public List<User> getUsers(){
        return userRepository.findAll();
    }
    public String deleteUser(int id){
        userRepository.deleteById(id);
        return "User Removed !!"+id;
    }
    public User updateUser(User user){
        User existingUser=userRepository.findById(user.getId()).orElse(null);
        existingUser.setFirstName(user.getFirstName());
        existingUser.setLastName(user.getLastName());
        existingUser.setEmail(user.getEmail());
        existingUser.setAge(user.getAge());
        return userRepository.save(existingUser);
    }
}
