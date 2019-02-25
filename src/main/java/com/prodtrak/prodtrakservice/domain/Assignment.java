package com.prodtrak.prodtrakservice.domain;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Assignment {

    private String name;
    private LocalDate dueDate;
    private Double gradePercentage;

    public Assignment(String name, LocalDate dueDate, Double gradePercentage) {
        this.name = name;
        this.dueDate = dueDate;
        this.gradePercentage = gradePercentage;
    }
}
