package com.tam.gitcement.repository;

import com.tam.gitcement.model.Cadr;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CadrRepository extends MongoRepository<Cadr, String> {
}
