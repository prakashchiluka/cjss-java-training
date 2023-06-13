package com.cjss.institute.service;

import com.cjss.institute.model.Employees;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmpService {

    private List<Employees> employeesList = new ArrayList<>();
    public Employees addEmployees( Employees employees){

        Employees employees1 = new Employees(employees.getId(), employees.getName(), employees.getSal(), employees.getLocation(), employees.getDepartment(), employees.getBenifits());
        employees1.setBenifits(employees.getBenifits());
        employeesList.add(employees1);
        return employees1;
    }

    public List<Employees> getEmployeesById(int id){
        return employeesList
                .stream()
                .filter(employee->employee.getId()==id)
                .collect(Collectors.toList());
    }

    public List<Employees> getEmployeesInIndia(String country){
        return employeesList.stream()
                .filter(employee -> employee.getLocation().getlCountry().equalsIgnoreCase(country))
                .collect(Collectors.toList());
    }

    public List<Employees> getEmployeesByCity(String city1 ,String city2){
      return     employeesList
                .stream()
                .filter(employee-> employee.getLocation().getlName().equalsIgnoreCase(city1)||employee.getLocation().getlName().equalsIgnoreCase(city2))
                  .collect(Collectors.toList());

    }

    public List<Employees> getEmployeeBenifitsDetails(){
      return   employeesList
                .stream()
                .filter(employee->employee.getBenifits().size()!=0)
                .collect(Collectors.toList());
    }

    public List<Employees> getEmployeesBasedOnCityAndCountry(String city , String country){
        return employeesList
                .stream()
                .filter(employee -> employee.getLocation().getlName().equalsIgnoreCase(city)
                        && employee.getLocation().getlCountry().equalsIgnoreCase(country))
                .collect(Collectors.toList());
    }
}
