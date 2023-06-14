package com.cjss.institute.validators;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Arrays;
import java.util.List;

public class CountryNameValidator implements ConstraintValidator <ValidateCountryName,String>{
    @Override
    public boolean isValid(String countryName, ConstraintValidatorContext context) {
        List<String> countryNamesList = Arrays.asList("India","Uk");
        return countryNamesList.contains(countryName);
    }
}
