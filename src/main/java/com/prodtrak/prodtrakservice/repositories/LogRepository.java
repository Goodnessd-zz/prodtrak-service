package com.prodtrak.prodtrakservice.repositories;

import com.prodtrak.prodtrakservice.domain.Log;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface LogRepository extends MongoRepository<Log, String>{
}
