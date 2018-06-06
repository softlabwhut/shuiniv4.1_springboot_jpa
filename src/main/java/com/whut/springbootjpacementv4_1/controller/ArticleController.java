package com.whut.springbootjpacementv4_1.controller;

import com.whut.springbootjpacementv4_1.entity.Article;
import com.whut.springbootjpacementv4_1.service.ArticleServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/articles")
public class ArticleController {

    @Autowired
    ArticleServiceImp articleServiceImp;

    @RequestMapping(value = "/{id}")
    public Article getArticleById(@PathVariable("id")Integer id){

        return articleServiceImp.getArticleById(id);

    }

}
