package com.tam.gitcement.repository;

import com.tam.gitcement.model.Processing;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProcessingRepository extends MongoRepository<Processing, String> {
}
