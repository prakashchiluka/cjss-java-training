package com.cjss.institute.controller;

import com.cjss.institute.model.Employees;
import com.cjss.institute.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class EmpController {

    @Autowired
    EmpService empService;
    @PostMapping("/add-Employee")
    public Employees addEmployees(@Valid @RequestBody Employees employees){
       return empService.addEmployees(employees);
    }

    @GetMapping("/get-by-id/{id}")
    public List<Employees> getEmployeesById(@PathVariable int id){
        return empService.getEmployeesById(id);
    }

    @GetMapping("/getEmployeesInIndia/{country}")
    public List<Employees> getEmployeesInIndia(String country){
        return empService.getEmployeesInIndia(country);
    }

    @GetMapping("/getEmployeesInCities/{city1}/{city2}")
    public List<Employees> getEmployeesByCity(@PathVariable(value = "city1") String city1 , @PathVariable(value = "city2") String city2){
        return empService.getEmployeesByCity(city1,city2);
    }

    @GetMapping("/getEmployeeBenifitsDetails")
    public List<Employees> getEmployeeBenifitsDetails(){
        return empService.getEmployeeBenifitsDetails();
    }

    @GetMapping("/getEmployeesBasedOnCityAndCountry/{city}/{country}")
    public List<Employees> getEmployeesBasedOnCityAndCountry(@PathVariable(value = "city") String city ,@PathVariable(value = "country") String country){
        return empService.getEmployeesBasedOnCityAndCountry(city,country);
    }
}
