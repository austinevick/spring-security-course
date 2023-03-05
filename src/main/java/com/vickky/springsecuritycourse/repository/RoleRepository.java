package com.vickky.springsecuritycourse.repository;

import com.vickky.springsecuritycourse.model.Role;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RoleRepository extends MongoRepository<Role,Long> {
    Role findByName(String name);
}
