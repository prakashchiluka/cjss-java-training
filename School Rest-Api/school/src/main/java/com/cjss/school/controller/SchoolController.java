package com.cjss.school.controller;

import com.cjss.school.Views;
import com.cjss.school.exceptions.StudentNotFound;
import com.cjss.school.model.Staff;
import com.cjss.school.model.Student;
import com.cjss.school.service.SchoolService;
import com.fasterxml.jackson.annotation.JsonView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
public class SchoolController {

    @Autowired
    SchoolService schoolService;

    @PostMapping("/add-student")
    @JsonView(Views.MyResponseViews.class)
    public Student addStudent(@RequestBody Student student) {
        return schoolService.addStudent(student);
    }


    @GetMapping("get-students-by-year/{year}")
    @JsonView(Views.MyResponseViews.class)
    public List<Student> getStudentsByYear(@PathVariable int year) {
       return   schoolService.getStudentsByYear(year);
    }

    @PostMapping("/add-staff")
    @JsonView(Views.MyResponseViews.class)
    public Staff addStaff(@RequestBody Staff staff) {
        return schoolService.addStaff(staff);
    }

    @GetMapping("get-students/{date}/{branch}")
    public List<Student> getStudentByDateAndBranch(@PathVariable(name = "date") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate date, @PathVariable(value = "branch") String branch) {
        return schoolService.getStudentByDateAndBranch(date, branch);
    }

    @GetMapping("get-staff/{date}/{subject}")
    public List<Staff> getStaffByDateAndSubject(@PathVariable(value = "date") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate date, @PathVariable(value = "subject") String subject) {
        return schoolService.getStaffByDateAndSubject(date, subject);
    }

    @GetMapping("get-failed-students/{year}")
    @JsonView(Views.MyResponseViews.class)
    public List<Student> getStudentsFailedByYear(@PathVariable int year) {
        return schoolService.getStudentsFailedByYear(year);
    }

    @GetMapping("get-staff-by-year/{year}")
    @JsonView(Views.MyResponseViews.class)
    public List<Staff> getStaffWhoTeachesByYear(@PathVariable int year) {
        return schoolService.getStaffWhoTeachesByYear(year);
    }


}