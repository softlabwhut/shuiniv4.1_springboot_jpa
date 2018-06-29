package com.whut.springbootjpacementv4_1.controller;

import com.whut.springbootjpacementv4_1.bean.Result;
import com.whut.springbootjpacementv4_1.entity.Company;
import com.whut.springbootjpacementv4_1.service.CompanyServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.sql.Date;
import java.util.List;
/**
 * @program: springbootjpacementv4_1
 * @description: 水泥厂的增删改查接口
 * @author: WuDi
 * @create: 2018-06-29 23:52
 **/
@RestController
@RequestMapping(value = "/company")
public class CompanyController
{
    @Autowired
    CompanyServiceImp  companyServiceImp;

    @RequestMapping(value = "/first50",method = RequestMethod.GET)
    public List<Company> getFirstFifty()
    {
        return companyServiceImp.getFirstFiftyCompanies();
    }

    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public Result addCompany(@ModelAttribute Company company, @RequestParam("regionId") Integer regionId,
                             @RequestParam("name")String name, @RequestParam("address")String address,
                             @RequestParam(value = "postcode",required = false) String postcode, @RequestParam("capacity")Integer capacity,
                             @RequestParam(value = "status",required = false)String status,@RequestParam(value = "phoneNumber",required = false) String phoneNumber,
                             @RequestParam(value = "yearCapacity")Integer yearCapacity,@RequestParam(value="remark",required = false) String remark,
                             @RequestParam(value = "invitedPerson",required = false)String invitedPerson,@RequestParam(value="wjTitle",required = false) String wjTitle,
                             @RequestParam(value = "startDate",required = false)Date startDate,@RequestParam(value = "endDate",required = false) Date endDate)
    {
        return companyServiceImp.addCompany(company);
    }

}
