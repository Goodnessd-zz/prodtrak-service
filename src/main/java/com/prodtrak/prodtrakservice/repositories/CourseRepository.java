package com.prodtrak.prodtrakservice.repositories;

import com.prodtrak.prodtrakservice.domain.Course;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CourseRepository extends MongoRepository<Course, String>{
}
