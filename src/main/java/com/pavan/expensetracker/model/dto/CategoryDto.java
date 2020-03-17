package com.pavan.expensetracker.model.dto;

import com.pavan.expensetracker.annotations.CheckCategoryType;
import com.pavan.expensetracker.annotations.NotNullOrBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CategoryDto {

    private String id;

    @NotNullOrBlank(message = "Category name must not be blank")
    private String categoryName;

    @NotNullOrBlank(message = "Category type must not be blank")
    @CheckCategoryType
    private String categoryType;
}
