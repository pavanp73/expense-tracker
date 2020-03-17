package com.pavan.expensetracker.validations;

import javax.validation.ConstraintValidator;
import java.lang.annotation.Annotation;
import java.util.List;

public abstract class CustomConstraintValidator<T extends Annotation> implements ConstraintValidator<T, String> {

    @Override
    public void initialize(T constraintAnnotation) {
    }

    boolean checkConstraint(String value, List<String> checkList){
        for (String e : checkList){
            if(e.equalsIgnoreCase(value)){
                return true;
            }
        }
        return false;
    }
}
