package com.whut.springbootjpacementv4_1.service;

import com.whut.springbootjpacementv4_1.bean.Result;
import com.whut.springbootjpacementv4_1.entity.Company;

import java.util.Date;
import java.util.List;

public interface CompanyService
{
    List<Company> getFirstFiftyCompanies();
//    Result addCompany(Integer id, Integer region_id,
//                      String name, String address,
//                      String postcode, Integer capacity,
//                      String status, String phone_number,
//                      Integer year_capacity, String remark,
//                      String invited_person, String wj_title,
//                      Date start_date, Date end_date);

}
