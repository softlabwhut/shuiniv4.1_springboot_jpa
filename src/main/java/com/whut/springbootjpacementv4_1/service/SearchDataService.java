package com.whut.springbootjpacementv4_1.service;

import com.whut.springbootjpacementv4_1.entity.SearchData;
import com.whut.springbootjpacementv4_1.repository.SearchDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

@Service
public class SearchDataService {

    @Autowired
    SearchDataRepository searchDataRepository;

    public Page<SearchData> query(){


        return  null;
    }

}
