package com.vickky.springsecuritycourse.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.Collection;
@Data
@Document
public class UserModel {
    @Id
    private Long id;
    private String name;
    private String username;
    private String password;
    private Collection<Role>roles = new ArrayList<>();
}
