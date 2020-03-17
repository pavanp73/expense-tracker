package com.pavan.expensetracker.annotations;

import com.pavan.expensetracker.validations.AccountTypeValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target({FIELD, METHOD, PARAMETER, ANNOTATION_TYPE, TYPE_USE})
@Retention(RUNTIME)
@Constraint(validatedBy = AccountTypeValidator.class)
@Documented
public @interface CheckAccountType {

    String message() default "{Invalid account type}";

    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default { };
}
