package com.whut.springbootjpacementv4_1.repository;


import com.whut.springbootjpacementv4_1.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;


//dao 层接口
//继承JpaRepository来完成对数据库的操作
//泛型的前一个参数代表数据表要映射的实体类，后一个参数为表中的主键类型
public interface UserRepository extends JpaRepository<User,Integer> {
    User findUserById(Integer id);
    User findUserByEmail(String email);


}
