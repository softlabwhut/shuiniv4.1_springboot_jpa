package com.whut.springbootjpacementv4_1.repository;

import com.whut.springbootjpacementv4_1.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegisterRepository extends JpaRepository<User,String> {


}
