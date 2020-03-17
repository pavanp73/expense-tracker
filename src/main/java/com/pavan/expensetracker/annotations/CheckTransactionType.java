package com.pavan.expensetracker.annotations;

import com.pavan.expensetracker.validations.TransactionTypeValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target({FIELD, METHOD, PARAMETER, ANNOTATION_TYPE, TYPE_USE})
@Retention(RUNTIME)
@Constraint(validatedBy = TransactionTypeValidator.class)
@Documented
public @interface CheckTransactionType {

    String message() default "{Invalid transaction type}";

    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default { };
}
