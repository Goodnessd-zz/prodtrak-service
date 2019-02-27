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
    private String userId;
    private String name;
    private CourseDetails details;

    public Course(String id, String name, CourseDetails details) {
        this.id = id;
        this.name = name;
        this.details = details;
    }
}
