package com.vickky.springsecuritycourse.model;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class Role {
    @Id
    private Long id;
    private String name;
}
