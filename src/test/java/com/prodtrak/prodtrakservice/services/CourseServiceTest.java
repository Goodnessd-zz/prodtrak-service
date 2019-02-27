package com.prodtrak.prodtrakservice.services;

import com.prodtrak.prodtrakservice.domain.Course;
import com.prodtrak.prodtrakservice.domain.CourseDetails;
import com.prodtrak.prodtrakservice.repositories.CourseRepository;
import com.prodtrak.prodtrakservice.repositories.LogRepository;
import org.junit.Before;
import org.junit.Test;

import static java.util.Optional.of;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class CourseServiceTest {

    private LogRepository logRepository;
    private CourseRepository courseRepository;
    private CourseService courseService;

    @Before
    public void setup(){
        courseRepository = mock(CourseRepository.class);
        logRepository = mock(LogRepository.class);
        courseService = new CourseService(courseRepository, logRepository);
    }

    @Test
    public void shouldSaveCourse() {
    courseService.save("1234", "bio 110", new CourseDetails(null, null, null));
        Course course = new Course("1234", "bio 110", new CourseDetails(null, null, null));
        verify(courseRepository, times(1)).save(course);
    }

    @Test
    public void shouldGetCourseById() {
        Course course = new Course("1234", "bio 110", new CourseDetails(null, null, null));
        when(courseRepository.findById("1234")).thenReturn(of(course));
        Course result = courseService.find("1234");


        assertEquals(result, course);
    }

    @Test
    public void shouldDeleteByCourseId() {
        Course course = new Course("1234", "bio 110", new CourseDetails(null, null, null));
        when(courseRepository.findById("1234")).thenReturn(of(course));

        courseService.delete("1234");


        verify(courseRepository, times(1)).delete(course);
        verify(logRepository, times(1)).deleteByCourseId("1234");
    }
}