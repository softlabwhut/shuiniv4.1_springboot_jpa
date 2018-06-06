package com.whut.springbootjpacementv4_1.service;

import com.whut.springbootjpacementv4_1.entity.User;
import com.whut.springbootjpacementv4_1.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImp implements UserService{

    @Autowired
    UserRepository userRepository;

    public User getUserById(Integer id){

        return userRepository.findUserById(id);

    }
    public User getUserByEmail(String email){
        return  userRepository.findUserByEmail(email);
    }

}
