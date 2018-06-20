package com.whut.springbootjpacementv4_1.controller;

import com.whut.springbootjpacementv4_1.bean.Result;
import com.whut.springbootjpacementv4_1.entity.Article;
import com.whut.springbootjpacementv4_1.service.ArticleServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/articles")
public class ArticleController {

    @Autowired
    ArticleServiceImp articleServiceImp;

    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public Article getArticleById(@PathVariable("id")Integer id){

        return articleServiceImp.getArticleById(id);

    }
    @RequestMapping(value = "/post",method = RequestMethod.POST)
    public Result createArticle(@ModelAttribute Article article,
                                @RequestParam("title")String title,
                                @RequestParam("author")String author,
                                @RequestParam("content") String content
                                )
    {
        return articleServiceImp.addArticle(article);
    }


}
