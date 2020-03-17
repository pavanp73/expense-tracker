package com.pavan.expensetracker.apis;

import com.pavan.expensetracker.model.dto.CategoryDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;
import java.util.List;

public interface CategoryResource {

    @PostMapping
    String addCategory(@RequestBody @Valid CategoryDto categoryDto);

    @GetMapping
    List<CategoryDto> getAllCategories();
}
