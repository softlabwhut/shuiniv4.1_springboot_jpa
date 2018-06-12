package com.whut.springbootjpacementv4_1.repository;

import com.whut.springbootjpacementv4_1.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoginRepository extends JpaRepository<User,Integer> {
    User findUserByEmailAndPassword(String email,String password);
    User findUserByEmail(String email);
}
