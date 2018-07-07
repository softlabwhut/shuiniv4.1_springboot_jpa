package com.whut.springbootjpacementv4_1.service;

import com.whut.springbootjpacementv4_1.entity.SearchData;
import com.whut.springbootjpacementv4_1.repository.SearchDataRepository;
import com.whut.springbootjpacementv4_1.repository.SearchDataSpec;
import com.whut.springbootjpacementv4_1.vo.SearchDataQueryVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class SearchDataService {

    @Autowired
    SearchDataRepository searchDataRepository;

    public SearchData  update(SearchData searchData){

       return searchDataRepository.save(searchData);
    }



    //删
    public void delData(Integer id){

        searchDataRepository.deleteById(id);
    }


    public SearchData addData(int researchGroupNum, int rcategory, String description,
                              String keyWord, String fileSrc, String author, int permissionCode) {
        SearchData searchData = new SearchData();
        searchData.setResearchGroupNum(researchGroupNum);
        searchData.setRcategory(rcategory);
        searchData.setDescription(description);
        searchData.setKeyWord(keyWord);
        searchData.setFileSrc(fileSrc);
        searchData.setAuthor(author);
        searchData.setPermissionCode(permissionCode);
        searchData.setPublishDate(new Date());

        return searchDataRepository.save(searchData);
    }

    public Page<SearchData> query(SearchDataQueryVo searchDataQueryVo, int page, int size) {


        return searchDataRepository.findAll(SearchDataSpec.getSpec(searchDataQueryVo), new PageRequest(page, size));

    }

}
