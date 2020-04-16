package com.tam.gitcement.repository;

import com.tam.gitcement.model.Point;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PointRepository extends MongoRepository<Point, String> {
}
