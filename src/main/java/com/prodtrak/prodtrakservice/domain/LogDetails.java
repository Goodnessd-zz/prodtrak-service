package com.prodtrak.prodtrakservice.domain;

import lombok.Data;

@Data
public class LogDetails {

    private Long duration;
    private String type;
    private Double readiness;
    private Exam associatedExam;
    private Assignment associatedAssignment;

    public LogDetails(Long duration, String type, Double readiness, Exam associatedExam, Assignment associatedAssignment) {
        this.duration = duration;
        this.type = type;
        this.readiness = readiness;
        this.associatedExam = associatedExam;
        this.associatedAssignment = associatedAssignment;
    }
}
