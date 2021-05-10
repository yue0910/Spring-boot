package com.example.demo.service;

import com.example.demo.entity.Article;

import java.util.List;

public interface ArticleService {
    public List<Article> getArticleList();
    Article findArticleById(long id);
}
