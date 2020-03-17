package com.pavan.expensetracker.service;

import com.pavan.expensetracker.mapper.CategoryMapper;
import com.pavan.expensetracker.model.dto.CategoryDto;
import com.pavan.expensetracker.model.entity.Category;
import com.pavan.expensetracker.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService{

    private final CategoryMapper categoryMapper;

    private final CategoryRepository categoryRepository;

    @Autowired
    public CategoryServiceImpl(CategoryMapper categoryMapper, CategoryRepository categoryRepository){
        this.categoryMapper = categoryMapper;
        this.categoryRepository = categoryRepository;
    }

    @Override
    public String addCategory(CategoryDto categoryDto) {
        return categoryRepository.save(
                categoryMapper.buildEntity(categoryDto)
        ).getId().toString();
    }

    @Override
    public List<CategoryDto> getAllCategories() {
        List<Category> categories = categoryRepository.findAll();
        if(categories == null){
            return new ArrayList<>();
        }
        return categoryMapper.buildListDto(categories);
    }
}