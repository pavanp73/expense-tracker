package com.pavan.expensetracker.annotations;

import com.pavan.expensetracker.validations.CategoryTypeValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.ElementType.TYPE_USE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target({FIELD, METHOD, PARAMETER, ANNOTATION_TYPE, TYPE_USE})
@Retention(RUNTIME)
@Constraint(validatedBy = CategoryTypeValidator.class)
@Documented
public @interface CheckCategoryType {

    String message() default "{Invalid category type}";

    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default { };
}
