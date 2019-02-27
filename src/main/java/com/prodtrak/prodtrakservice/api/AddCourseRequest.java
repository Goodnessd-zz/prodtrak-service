package com.prodtrak.prodtrakservice.api;

import com.prodtrak.prodtrakservice.domain.CourseDetails;
import lombok.Data;

@Data
public class AddCourseRequest {
    private String name;
    private CourseDetails courseDetails;

    public AddCourseRequest(String name, CourseDetails courseDetails) {
        this.name = name;
        this.courseDetails = courseDetails;
    }

    public AddCourseRequest(){

    }

}
