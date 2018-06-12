package com.whut.springbootjpacementv4_1.repository;

import com.whut.springbootjpacementv4_1.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository(value = "companyRepository")
public interface CompanyRepository extends JpaRepository<Company,Integer> {
    List<Company> getAll();
}
