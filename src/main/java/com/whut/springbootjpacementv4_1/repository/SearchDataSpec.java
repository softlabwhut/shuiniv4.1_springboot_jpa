package com.whut.springbootjpacementv4_1.repository;

import com.whut.springbootjpacementv4_1.entity.SearchData;
import com.whut.springbootjpacementv4_1.vo.SearchDataQueryVo;

import org.springframework.data.jpa.domain.Specification;

import javax.persistence.criteria.*;
import java.util.ArrayList;
import java.util.List;

public class SearchDataSpec {
    public static Specification<SearchData> getSpec(SearchDataQueryVo searchDataQueryVo) {
        return new Specification<SearchData>() {

            SearchData searchData = searchDataQueryVo.getSearchData();

            public Predicate toPredicate(Root<SearchData> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
                Predicate p1 = null;


                List<Predicate> list = new ArrayList<Predicate>();

                int researchgroupnum = searchData.getResearchGroupNum();
                if (researchgroupnum != 0) {
                    Path<Integer> researchgroupnumPath = root.get("researchGroupNum");
                    list.add(cb.equal(researchgroupnumPath, researchgroupnum));
                }
                int rcategory = searchData.getRcategory();
                if (rcategory != 0) {
                    Path<Integer> rcategoryPath = root.get("rcategory");
                    list.add(cb.equal(rcategoryPath, rcategory));
                }
                String description = searchData.getDescription();
                String keyWord = searchData.getKeyWord();
                String author = searchData.getAuthor();

                if (searchData.getDescription() != null && !description.equals("")) {
                    //模糊 或者精确查找
                    Path<String> descriptionPath = root.get("description");
                    if (searchDataQueryVo.getDescription() == 1)
                        list.add(cb.equal(descriptionPath, description));
                    else
                        list.add(cb.like(descriptionPath, description));
                }
                if (keyWord!=null && ! keyWord.equals("")) {
                    //模糊 或者精确查找
                    Path<String> keyWordPath = root.get("keyWord");
                    if (searchDataQueryVo.getKeyWord() == 1)
                        list.add(cb.equal(keyWordPath, keyWord));
                    else
                        list.add(cb.like(keyWordPath, keyWord));
                }
                if (author!=null && ! author.equals("")) {
                    //模糊 或者精确查找
                    Path<String> authorPath = root.get("author");
                    if (searchDataQueryVo.getKeyWord() == 1)
                        list.add(cb.equal(authorPath, author));
                    else
                        list.add(cb.like(authorPath, author));
                }
                Predicate[] p = new Predicate[list.size()];
                return cb.and(list.toArray(p));

            }
        };
    }
}
