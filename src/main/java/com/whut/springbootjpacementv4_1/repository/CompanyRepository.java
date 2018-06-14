package com.whut.springbootjpacementv4_1.repository;

import com.whut.springbootjpacementv4_1.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository(value = "companyRepository")   //这里继承的第二个接口是为了分页复杂查询
public interface CompanyRepository extends JpaRepository<Company,Integer> ,JpaSpecificationExecutor<Company> {
    List<Company> findCompaniesByIdIsBefore(Integer number);
    Company findCompanyById(Integer id);
    Company findCompanyByName(String name);
}
