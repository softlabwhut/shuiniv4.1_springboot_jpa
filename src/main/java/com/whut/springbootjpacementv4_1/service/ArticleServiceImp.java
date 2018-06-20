package com.whut.springbootjpacementv4_1.service;

import com.whut.springbootjpacementv4_1.bean.Result;
import com.whut.springbootjpacementv4_1.entity.Article;
import com.whut.springbootjpacementv4_1.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArticleServiceImp implements ArticleService{
    @Autowired
    ArticleRepository articleRepository;

    public Article getArticleById(Integer id) {
        return articleRepository.findById(id).orElse(null);
    }


    public Result addArticle(Article article) {

       if (article!=null) {
           articleRepository.save(article);

           return new Result(article);
       }else
           return new Result(104,"创建新闻失败！");
    }
}
