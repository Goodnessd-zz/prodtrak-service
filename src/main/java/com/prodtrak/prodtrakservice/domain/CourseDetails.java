package com.prodtrak.prodtrakservice.domain;

import lombok.Data;

@Data
public class CourseDetails {

    private Integer hoursSpent;
    private Double currentGrade;
    private Integer daysRemaining;

    public CourseDetails(){

    }

    public CourseDetails(Integer hoursSpent, Double currentGrade, Integer daysRemaining) {
        this.hoursSpent = hoursSpent;
        this.currentGrade = currentGrade;
        this.daysRemaining = daysRemaining;
    }
}
