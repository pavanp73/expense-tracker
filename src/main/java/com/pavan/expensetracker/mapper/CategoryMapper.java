package com.pavan.expensetracker.mapper;

import com.pavan.expensetracker.model.dto.CategoryDto;
import com.pavan.expensetracker.model.entity.Category;
import com.pavan.expensetracker.model.enums.CategoryType;
import org.springframework.stereotype.Service;

@Service
public class CategoryMapper extends AbstractMapper<Category, CategoryDto> {

    @Override
    public CategoryDto buildDto(Category category) {
        return CategoryDto.builder()
                .id(category.getId().toString())
                .categoryName(category.getCategoryName())
                .categoryType(category.getCategoryType())
                .build();
    }

    @Override
    public Category buildEntity(CategoryDto categoryDto) {
        if(categoryDto.getCategoryType().equalsIgnoreCase(CategoryType.EXPENSE.name()))
        {
            return getCategoryObject(categoryDto, CategoryType.EXPENSE.toString());
        }
        else if(categoryDto.getCategoryType().equalsIgnoreCase(CategoryType.INCOME.name())){
            return getCategoryObject(categoryDto, CategoryType.INCOME.toString());
        }
        else {
            return getCategoryObject(categoryDto, CategoryType.TRANSFER.toString());
        }
    }

    private Category getCategoryObject(CategoryDto categoryDto, String categoryType) {
        return Category.builder()
                .categoryName(categoryDto.getCategoryName())
                .categoryType(categoryType)
                .build();
    }
}