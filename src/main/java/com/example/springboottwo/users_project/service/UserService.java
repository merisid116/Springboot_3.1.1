package com.example.springboottwo.users_project.service;

import com.example.springboottwo.users_project.entity.User;
import java.util.List;

public interface UserService {
     void addUser(User user);
     void deleteUser(Long id);
     void editUser(User user);
     User getUserById(Long id);
     List<User> getAllUsers();
}
