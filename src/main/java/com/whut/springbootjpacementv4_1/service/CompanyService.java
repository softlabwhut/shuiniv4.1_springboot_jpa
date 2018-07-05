package com.whut.springbootjpacementv4_1.service;

import com.whut.springbootjpacementv4_1.bean.Result;
import com.whut.springbootjpacementv4_1.entity.Company;

import java.util.Date;
import java.util.List;

public interface CompanyService
{
    List<Company> getFirstFiftyCompanies();
      Result addCompany(Company company);

}
