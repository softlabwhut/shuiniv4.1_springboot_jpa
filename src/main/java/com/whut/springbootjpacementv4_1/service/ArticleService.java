package com.whut.springbootjpacementv4_1.service;

import com.whut.springbootjpacementv4_1.bean.Result;
import com.whut.springbootjpacementv4_1.entity.Article;

public interface ArticleService {

    Article getArticleById(Integer id);
    Result addArticle(Article article);
}
