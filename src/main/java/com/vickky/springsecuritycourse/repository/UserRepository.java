package com.vickky.springsecuritycourse.repository;

import com.vickky.springsecuritycourse.model.UserModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<UserModel,Long> {
    UserModel findByUsername(String name);
}
