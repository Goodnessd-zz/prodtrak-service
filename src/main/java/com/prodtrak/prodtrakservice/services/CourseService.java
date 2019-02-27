package com.prodtrak.prodtrakservice.services;

import com.prodtrak.prodtrakservice.domain.Course;
import com.prodtrak.prodtrakservice.domain.CourseDetails;
import com.prodtrak.prodtrakservice.domain.Log;
import com.prodtrak.prodtrakservice.repositories.CourseRepository;
import com.prodtrak.prodtrakservice.repositories.LogRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    private CourseRepository courseRepository;
    private LogRepository logRepository;

    public CourseService(CourseRepository courseRepository, LogRepository logRepository) {
        this.courseRepository = courseRepository;
        this.logRepository = logRepository;
    }

    public void save(String id, String name, CourseDetails courseDetails) {
        Course course = new Course(id, name, courseDetails);
        courseRepository.save(course);
    }

    public Course find(String id) {
        return courseRepository.findById(id).orElse(null);
    }

    public List<Course> findAll() {
        return courseRepository.findAll();
    }

    public void delete(String courseId) {
        courseRepository.findById(courseId)
                .ifPresent(course -> courseRepository.delete(course));

        logRepository.deleteByCourseId(courseId);
    }
}
