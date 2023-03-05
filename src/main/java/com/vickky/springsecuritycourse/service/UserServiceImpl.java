package com.vickky.springsecuritycourse.service;

import com.vickky.springsecuritycourse.model.Role;
import com.vickky.springsecuritycourse.model.UserModel;
import com.vickky.springsecuritycourse.repository.RoleRepository;
import com.vickky.springsecuritycourse.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional
@Slf4j
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final RoleRepository roleRepository;

    @Override
    public UserModel saveUser(UserModel user) {
        log.info("Saving new user");
        return userRepository.save(user);
    }

    @Override
    public Role saveRole(Role role) {
        return roleRepository.save(role);
    }

    @Override
    public void addRoleToAUser(String username, String roleName) {
        UserModel user = userRepository.findByUsername(username);
        Role role = roleRepository.findByName(roleName);
        user.getRoles().add(role);

    }

    @Override
    public UserModel getUser(String username) {
        return userRepository.findByUsername(username);
    }

    @Override
    public List<UserModel> getUsers() {
        return userRepository.findAll();
    }
}
