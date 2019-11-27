package com.briup.cms.web.controller;

import com.briup.cms.bean.Article;
import com.briup.cms.service.IArticleService;
import com.briup.cms.util.Message;
import com.briup.cms.util.MessageUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api(description = "信息管理")
@RestController
@RequestMapping("/article")
public class ArticleControlle {
   @Autowired
    private IArticleService articleService;
    @PostMapping("/add")
    @ApiOperation(value = "增加信息", notes = "category.code category.name 不需要输入")
    public Message addArticle(Article article){
        articleService.addArticle(article);
        return MessageUtil.success();
    }

    @GetMapping("/delete")
    @ApiOperation(value = "删除单个信息", notes = "category.code category.name 不需要输入")
    @ApiImplicitParam(value = "信息id" ,required = true, dataType = "int", name = "id", paramType = "query")
    public Message deleteArticle(int id){
        articleService.deleteArticle(id);
        return MessageUtil.success();
    }
    @GetMapping("/deleteAll")
    @ApiOperation(value = "删除所有信息")
    public Message deleteAllArticle(){
        articleService.deleteAllArticle();
        return MessageUtil.success();
    }

    @PostMapping("/update")
    @ApiOperation(value = "修改信息", notes = "category.code category.name 不需要输入")
    public Message updateArticle(Article article){
        articleService.addArticle(article);
        return MessageUtil.success();
    }
    @GetMapping("/findById")
    @ApiOperation(value = "根据id查询")
    public Message<Article> findById(int id){
        Article article = articleService.findById(id);
        return MessageUtil.success(article);
    }
    @GetMapping("/findAll")
    @ApiOperation(value = "查询所有")
    public Message<List<Article>> findAll(){
        List<Article> articles = articleService.selectAllArticle();
        return MessageUtil.success(articles);
    }
}
