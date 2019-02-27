package com.prodtrak.prodtrakservice.api;

import com.prodtrak.prodtrakservice.domain.Course;
import com.prodtrak.prodtrakservice.services.CourseService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.DELETE;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
@RequestMapping("/course")
public class CourseController {

    private CourseService courseService;

    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }


    @RequestMapping(value = "/{courseId}", method = POST, consumes = "application/json", produces = "application/json")
    public void handle(@PathVariable String courseId, @RequestBody AddCourseRequest request) {
        courseService.save(courseId, request.getName(), request.getCourseDetails());
    }

    @RequestMapping(method = GET)
    public List<Course> handle() {
        return courseService.findAll();
    }

    @RequestMapping(value = "/{courseId}", method = GET)
    public Course handle(@PathVariable String courseId) {
        return courseService.find(courseId);
    }

    @RequestMapping(value = "/{courseId}", method = DELETE)
    public void delete(@PathVariable String courseId) {
        courseService.delete(courseId);
    }

}

