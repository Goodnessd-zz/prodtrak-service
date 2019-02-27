package com.prodtrak.prodtrakservice.api;

import com.google.gson.Gson;
import com.prodtrak.prodtrakservice.domain.Course;
import com.prodtrak.prodtrakservice.domain.CourseDetails;
import com.prodtrak.prodtrakservice.services.CourseService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.when;
import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@RunWith(SpringRunner.class)
@WebMvcTest(CourseController.class)
public class CourseControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    CourseService courseService;

    @Test
    public void shouldReturnCourse() throws Exception {
        Course course = new Course("1234", "bio 110", new CourseDetails(10, 8.5, 6));
        when(courseService.find("1234")).thenReturn(course);

        this.mockMvc.perform(get("/course/1234"))
                .andExpect(status().isOk()).andExpect(content().json("{\n" +
                "        \"id\": \"1234\",\n" +
                "        \"name\": \"bio 110\",\n" +
                "        \"details\": {hoursSpent: 10, currentGrade: 8.5, daysRemaining: 6}\n" +
                "    }"));
    }

    @Test
    public void shouldAddCourse() throws Exception {
        CourseDetails details = new CourseDetails(10, 8.5, 6);
        AddCourseRequest addCourseRequest = new AddCourseRequest("bio 110", details);
        Gson gson = new Gson();
        String json = gson.toJson(addCourseRequest, AddCourseRequest.class);

        this.mockMvc.perform(
                post("/course/1234")
                        .contentType(APPLICATION_JSON_UTF8)
                        .content(json))
                .andExpect(status().isOk());

        Mockito.verify(courseService, times(1)).save("1234", "bio 110", details);
    }

    @Test
    public void shouldDeleteCourse() throws Exception {
        this.mockMvc.perform(
                delete("/course/1234"))
                .andExpect(status().isOk());

        Mockito.verify(courseService, times(1)).delete("1234");
    }

}
