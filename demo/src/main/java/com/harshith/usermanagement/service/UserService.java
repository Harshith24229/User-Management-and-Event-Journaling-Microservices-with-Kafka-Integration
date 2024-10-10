package com.harshith.usermanagement.service;

import com.harshith.usermanagement.entity.User;

import java.util.List;

public interface UserService {
    User registerUser(User user);
    List<User> getAllUsers();
    User getUserById(Long id);
    User updateUser(Long id, User userDetails);
    void deleteUser(Long id);
}
