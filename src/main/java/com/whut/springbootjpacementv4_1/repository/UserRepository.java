package com.whut.springbootjpacementv4_1.repository;

import com.whut.springbootjpacementv4_1.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

//dao 层接口
//继承JpaRepository来完成对数据库的操作
public interface UserRepository extends JpaRepository<User,Integer> {


}
