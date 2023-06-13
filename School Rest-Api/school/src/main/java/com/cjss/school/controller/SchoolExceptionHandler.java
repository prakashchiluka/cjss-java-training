package com.cjss.school.controller;

import com.cjss.school.exceptions.StaffNotFoundException;
import com.cjss.school.exceptions.StudentNotFound;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class SchoolExceptionHandler {

    @ExceptionHandler(StudentNotFound.class)
    public ResponseEntity<String> exception(StudentNotFound e){
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
    }


    @ExceptionHandler(StaffNotFoundException.class)
    public ResponseEntity<String> exception(StaffNotFoundException e){
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
    }
}
