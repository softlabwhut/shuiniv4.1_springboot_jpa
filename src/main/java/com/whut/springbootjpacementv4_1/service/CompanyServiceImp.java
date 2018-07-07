package com.whut.springbootjpacementv4_1.service;

import com.whut.springbootjpacementv4_1.bean.Result;
import com.whut.springbootjpacementv4_1.entity.Company;
import com.whut.springbootjpacementv4_1.repository.CompanyRepository;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.sql.Date;
import java.util.List;

@Service
public class CompanyServiceImp implements CompanyService
{
    @Resource
    CompanyRepository companyRepository;

    public List<Company> getFirstFiftyCompanies()
    {   //获取前五十company
        return  companyRepository.findCompaniesByIdIsBefore(50);
    }


    public Result addCompany(Company company)
    {

        if (companyRepository.findCompanyByName(company.getName())!=null){
//            Company newCompany=new Company( region_id,name,  address,  postcode,  capacity,
//                    status, phone_number,  year_capacity, remark,
//                    invited_person, wj_title, start_date, end_date);
            return new Result(201,"公司已存在，添加失败！");
        }else {
            System.out.print(company.getRegionId());
            companyRepository.save(company);
            return new Result(company);
        }
    }
}
