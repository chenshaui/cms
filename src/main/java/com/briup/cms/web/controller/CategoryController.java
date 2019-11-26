package com.briup.cms.web.controller;

import com.briup.cms.bean.Category;
import com.briup.cms.service.ICategoryService;
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

@RestController
@Api(description = "栏目管理")
@RequestMapping("/category")
public class CategoryController {
    @Autowired
    private ICategoryService categoryService;

    @ApiOperation("添加栏目")
    @PostMapping("/add")
    public Message addCategory(Category category){
        categoryService.addCategory(category);
        return MessageUtil.success();
    }
    @ApiOperation("删除栏目")
    @GetMapping("/delete")
    @ApiImplicitParam(name = "id", required = true, paramType = "query",dataType = "int",value = "栏目id")
    public Message deleteCategory(int id){
        categoryService.deleteCategory(id);
        return MessageUtil.success();
    }

    @ApiOperation("更新栏目")
    @PostMapping("/update")
    public Message updateCategory(Category category){
        categoryService.addCategory(category);
        return MessageUtil.success();
    }

    @ApiOperation("查询栏目")
    @GetMapping("/queryById")
    @ApiImplicitParam(name = "id", required = true, paramType = "query",dataType = "int", value = "栏目id")
    public Message<Category> queryById(int id){
        Category category = categoryService.queryById(id);
        return MessageUtil.success(category);
    }
    @ApiOperation("查询所有栏目")
    @GetMapping("/findAll")
    public Message<List<Category>> findAll(){
        List<Category> categories = categoryService.findAll();
        return MessageUtil.success(categories);
    }

}
