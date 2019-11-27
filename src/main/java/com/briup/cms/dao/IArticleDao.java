package com.briup.cms.dao;

import com.briup.cms.bean.Article;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IArticleDao extends JpaRepository<Article, Integer> {
    Article queryById(int id);
}
