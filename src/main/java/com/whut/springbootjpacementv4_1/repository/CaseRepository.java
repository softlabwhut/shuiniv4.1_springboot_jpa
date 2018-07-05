package com.whut.springbootjpacementv4_1.repository;

import com.whut.springbootjpacementv4_1.entity.Case;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CaseRepository  extends JpaRepository<Case,Integer>{

    List<Case> findCasesByCnameLike(String c_name);

    List<Case>  findByCcategoryAndCnameLike(Integer c_category,String c_name);
}
