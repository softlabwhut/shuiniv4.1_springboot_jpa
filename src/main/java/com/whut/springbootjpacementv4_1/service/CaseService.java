package com.whut.springbootjpacementv4_1.service;

import com.whut.springbootjpacementv4_1.entity.Case;
import com.whut.springbootjpacementv4_1.repository.CaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CaseService {

    @Autowired
    CaseRepository caseRepository;

    public Case addCase(String c_name,
                        Integer c_category,
                        String c_fileSrc) {
        Case e_case = new Case();
        e_case.setCname(c_name);
        e_case.setCcategory(c_category);
        e_case.setCfileSrc(c_fileSrc);

        //插入数据库
        Case r_case = caseRepository.save(e_case);
        return r_case;
    }

    public List queryCase(
            String c_name,
            Integer c_category
    ) {
        List<Case> res;
        if (c_category == null)
            res = caseRepository.findCasesByCnameLike("%" + c_name + "%");
        else
        res = caseRepository.findByCcategoryAndCnameLike(c_category, "%" + c_name + "%");
        return res;
    }
}
