package com.example.demoboot.service;

import com.example.demoboot.model.User;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;


public interface UserService extends UserDetailsService {
    boolean add(User user);
    void removeById(Long id);
    void edit(User user);
    List<User> listUsers();
    User getUserById(Long id);
    User findByName(String username);
}
