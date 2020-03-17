package com.pavan.expensetracker.service;

import com.pavan.expensetracker.model.dto.CategoryDto;
import com.pavan.expensetracker.model.entity.Category;

import java.util.List;

public interface CategoryService {

    String addCategory(CategoryDto categoryDto);

    List<CategoryDto> getAllCategories();
}
