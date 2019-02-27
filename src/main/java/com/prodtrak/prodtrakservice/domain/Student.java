package com.prodtrak.prodtrakservice.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "student")
@Data
public class Student {

    @Id
    private String id;
    private List<String> courses;
    private List<String> logs;
    private StudentDetails userDetails;

    public Student(String id, List<String> courses, List<String> logs, StudentDetails userDetails) {
        this.id = id;
        this.courses = courses;
        this.logs = logs;
        this.userDetails = userDetails;
    }
}
