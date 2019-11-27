package com.briup.cms.service;

import com.briup.cms.bean.Article;
import com.briup.cms.exception.CustomerException;

import java.util.List;

public interface IArticleService {
    void addArticle(Article article) throws CustomerException;
    void deleteArticle(int id) throws CustomerException;
    void deleteAllArticle() throws CustomerException;
    List<Article> selectAllArticle() throws CustomerException;
    Article findById(int id) throws CustomerException;
}
