package com.whut.springbootjpacementv4_1.repository;

import com.whut.springbootjpacementv4_1.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ArticleRepository extends JpaRepository<Article,Integer> {

}
