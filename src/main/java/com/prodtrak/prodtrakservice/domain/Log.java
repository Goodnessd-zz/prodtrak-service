package com.prodtrak.prodtrakservice.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "log")
@Data
public class Log {

    @Id
    private String id;
    private String courseId;
    private String description;
    private LogDetails logDetails;

    public Log(String id, String courseId, String description, LogDetails logDetails) {
        this.id = id;
        this.courseId = courseId;
        this.description = description;
        this.logDetails = logDetails;
    }
}
