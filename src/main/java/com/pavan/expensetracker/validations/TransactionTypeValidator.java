package com.pavan.expensetracker.validations;

import com.pavan.expensetracker.annotations.CheckTransactionType;
import com.pavan.expensetracker.model.enums.TransactionType;

import javax.validation.ConstraintValidatorContext;
import java.util.Arrays;
import java.util.stream.Collectors;

public class TransactionTypeValidator extends CustomConstraintValidator<CheckTransactionType>{

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        return checkConstraint(value,
                Arrays.stream(TransactionType.values())
                .map(Enum::name)
                .collect(Collectors.toList())
        );
    }
}
