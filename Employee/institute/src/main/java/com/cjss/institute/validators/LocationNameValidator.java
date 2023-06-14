package com.cjss.institute.validators;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LocationNameValidator implements ConstraintValidator <ValidateLocationName,String>{
    @Override
    public boolean isValid(String CityName, ConstraintValidatorContext context) {
        List<String> cityNamesList = Arrays.asList("Hyderabad","Chennai","London");
        return cityNamesList.contains(CityName);
    }
}
