package com.prodtrak.prodtrakservice.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "course")
@Data
public class Course {

    @Id
    private String id;
    private String name;
    private CourseDetails details;
    private List<Log> logs;

    public Course(String id, String name, CourseDetails details, List<Log> logs) {
        this.id = id;
        this.name = name;
        this.details = details;
        this.logs = logs;
    }
}
