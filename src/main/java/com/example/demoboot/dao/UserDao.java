package com.example.demoboot.dao;


import com.example.demoboot.model.User;

import java.util.List;

public interface UserDao {
   boolean add(User user);
   void removeById(Long id);
   void edit(User user);
   List<User> listUsers();
   User getUserById(Long id);
   User findByName(String username);
}
