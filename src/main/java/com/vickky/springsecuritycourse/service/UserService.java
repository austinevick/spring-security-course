package com.vickky.springsecuritycourse.service;

import com.vickky.springsecuritycourse.model.Role;
import com.vickky.springsecuritycourse.model.UserModel;

import java.util.List;

public interface UserService {
    UserModel saveUser(UserModel user);
    Role saveRole(Role role);
    void addRoleToAUser(String username,String roleName);
    UserModel getUser(String username);
    List<UserModel>getUsers();
}
