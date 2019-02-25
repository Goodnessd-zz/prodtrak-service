package com.prodtrak.prodtrakservice.domain;

import lombok.Data;

@Data
public class CourseDetails {

    private Integer hoursSpent;
    private Long currentGrade;
    private Integer daysRemaining;

    public CourseDetails(Integer hoursSpent, Long currentGrade, Integer daysRemaining) {
        this.hoursSpent = hoursSpent;
        this.currentGrade = currentGrade;
        this.daysRemaining = daysRemaining;
    }
}
