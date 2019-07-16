package com.egiants.syed.app.service;

import com.egiants.syed.app.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
}
