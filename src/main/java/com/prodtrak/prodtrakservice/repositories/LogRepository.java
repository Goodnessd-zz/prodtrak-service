package com.prodtrak.prodtrakservice.repositories;

import com.prodtrak.prodtrakservice.domain.Log;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface LogRepository extends MongoRepository<Log, String> {
    List<Log> deleteByCourseId(String courseId);
}
