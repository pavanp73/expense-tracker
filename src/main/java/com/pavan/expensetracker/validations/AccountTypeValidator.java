package com.pavan.expensetracker.validations;

import com.pavan.expensetracker.annotations.CheckAccountType;
import com.pavan.expensetracker.model.enums.AccountType;

import javax.validation.ConstraintValidatorContext;
import java.util.Arrays;
import java.util.stream.Collectors;

public class AccountTypeValidator extends CustomConstraintValidator<CheckAccountType> {

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        System.out.println(Arrays.toString(AccountType.values()));
        return checkConstraint(value,
                Arrays.stream(AccountType.values())
                .map(AccountType::toString)
                .collect(Collectors.toList()));
    }
}
