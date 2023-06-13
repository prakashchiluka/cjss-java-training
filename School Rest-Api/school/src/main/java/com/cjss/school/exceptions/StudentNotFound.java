package com.cjss.school.exceptions;

public class StudentNotFound extends RuntimeException{
    public StudentNotFound(String msg){
        super(msg);
    }
}
