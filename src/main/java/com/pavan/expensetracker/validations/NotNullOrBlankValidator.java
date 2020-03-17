package com.pavan.expensetracker.validations;

import com.pavan.expensetracker.annotations.NotNullOrBlank;

import javax.validation.ConstraintValidatorContext;

public class NotNullOrBlankValidator extends CustomConstraintValidator<NotNullOrBlank>{

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        return value != null && !value.isEmpty();
    }
}
