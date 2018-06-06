package com.whut.springbootjpacementv4_1.service;

import com.whut.springbootjpacementv4_1.entity.User;


public interface UserService {

     User getUserById(Integer id);
     User getUserByEmail(String email);
}
