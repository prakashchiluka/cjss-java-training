package com.cjss.school.model;

import java.time.LocalDate;

public class Attendance {
    LocalDate date;

    public Attendance(LocalDate date) {
        this.date = date;
    }

    public LocalDate getDate() {
        return date;
    }

    public Attendance() {
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
