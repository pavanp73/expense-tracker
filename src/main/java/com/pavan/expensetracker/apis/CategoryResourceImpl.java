package com.pavan.expensetracker.apis;

import com.pavan.expensetracker.model.dto.CategoryDto;
import com.pavan.expensetracker.service.CategoryService;
import com.pavan.expensetracker.service.CategoryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/categories")
public class CategoryResourceImpl implements CategoryResource {

    private final CategoryService categoryService;

    @Autowired
    public CategoryResourceImpl(CategoryServiceImpl categoryServiceImpl){
        this.categoryService = categoryServiceImpl;
    }

    public String addCategory(
            @RequestBody @Valid CategoryDto categoryDto
    ){
        return categoryService.addCategory(categoryDto);
    }

    @Override
    public List<CategoryDto> getAllCategories() {
        return categoryService.getAllCategories();
    }
}