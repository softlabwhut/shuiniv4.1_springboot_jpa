package com.whut.springbootjpacementv4_1.service;

import com.whut.springbootjpacementv4_1.bean.Result;
import com.whut.springbootjpacementv4_1.entity.User;


public interface UserService {

     User getUserById(Integer id);
     User getUserByEmail(String email);
     String deleteUserById(Integer id);
     Result addUser(User user);
     //Result updateuser();
}
