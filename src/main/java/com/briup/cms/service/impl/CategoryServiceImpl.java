package com.briup.cms.service.impl;

import com.briup.cms.bean.Category;
import com.briup.cms.dao.ICategoryDao;
import com.briup.cms.exception.CustomerException;
import com.briup.cms.service.ICategoryService;
import com.briup.cms.util.CodeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements ICategoryService {
    @Autowired
    private ICategoryDao categoryDao;
    @Override
    public void addCategory(Category category) throws CustomerException {
        if (category == null) {
            throw new CustomerException(CodeUtil.BAD_CODE, "参数为空");
        }
        categoryDao.save(category);
    }

    @Override
    public void deleteCategory(int id) throws CustomerException {
        categoryDao.deleteById(id);
    }

    @Override
    public Category queryById(int id) throws CustomerException {
        Category category = categoryDao.queryById(id);
        return category;
    }

    @Override
    public List<Category> findAll() throws CustomerException {
        List<Category> categories = categoryDao.findAll();
        return categories;
    }
}
