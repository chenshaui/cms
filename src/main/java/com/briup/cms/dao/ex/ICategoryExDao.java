package com.briup.cms.dao.ex;

import com.briup.cms.bean.Category;
import com.briup.cms.bean.ex.CategoryEx;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ICategoryExDao extends JpaRepository<CategoryEx, Integer> {
}
