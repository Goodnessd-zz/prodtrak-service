package com.prodtrak.prodtrakservice.domain;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Exam {
    private String name;
    private LocalDate dueDate;
    private Double gradePercentage;

    public Exam(String name, LocalDate dueDate, Double gradePercentage) {
        this.name = name;
        this.dueDate = dueDate;
        this.gradePercentage = gradePercentage;
    }
}
