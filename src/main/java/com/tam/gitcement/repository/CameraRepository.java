package com.tam.gitcement.repository;

import com.tam.gitcement.model.Camera;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CameraRepository extends MongoRepository<Camera, String> {
}
