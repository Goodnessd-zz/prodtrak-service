package com.prodtrak.prodtrakservice.repositories;

import com.prodtrak.prodtrakservice.domain.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepository extends MongoRepository<Student, String>{
}
