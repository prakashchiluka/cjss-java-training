package com.cjss.institute.validators;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD,ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = CountryNameValidator.class)
public @interface ValidateCountryName {
    public String message() default "please provide Valid Country Name ex: India or UK";

    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default { };

}
