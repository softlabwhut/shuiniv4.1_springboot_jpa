package com.whut.springbootjpacementv4_1.repository;

import com.whut.springbootjpacementv4_1.entity.SearchData;
import com.whut.springbootjpacementv4_1.vo.SearchDataQueryVo;

import org.springframework.data.jpa.domain.Specification;

import javax.persistence.criteria.*;

public class SearchDataSpec {
    public static Specification<SearchData> getSpec(SearchDataQueryVo searchDataQueryVo) {
        return new Specification<SearchData>() {

                  SearchData searchData=searchDataQueryVo.getSearchData();
            public Predicate toPredicate(Root<SearchData> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
                Predicate p1 = null;
/**
 *  if(age!=0) {
 *                     Predicate p2 = cb.equal(root.get(UserInfo_.age), age);
 *                     if(p1 != null) {
 *                         p1 = cb.and(p1,p2);
 *                     } else {
 *                         p1 = p2;
 *                     }
 *                 }
 */

                if (searchData.getDescription() != null)
                // Path<String> descriptionPath;

                {
                    return p1;
                }
            return p1;}
        };
    }
}
