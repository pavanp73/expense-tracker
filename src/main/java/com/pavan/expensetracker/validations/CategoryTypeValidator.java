package com.pavan.expensetracker.validations;

import com.pavan.expensetracker.annotations.CheckCategoryType;
import com.pavan.expensetracker.model.enums.CategoryType;

import javax.validation.ConstraintValidatorContext;
import java.util.Arrays;
import java.util.stream.Collectors;

public class CategoryTypeValidator extends CustomConstraintValidator<CheckCategoryType> {

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        return checkConstraint(value,
                Arrays.stream(CategoryType.values())
                .map(CategoryType::toString)
                .collect(Collectors.toList())
        );
    }
}