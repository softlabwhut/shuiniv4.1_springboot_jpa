package com.whut.springbootjpacementv4_1.repository;

import com.whut.springbootjpacementv4_1.entity.Case;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CaseRepository extends JpaRepository<Case,Integer> {
}
