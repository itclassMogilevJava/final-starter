package com.itclass.service;

import com.itclass.dto.LoginDto;
import com.itclass.entity.User;

import java.util.Optional;

public interface UserService {
    Optional<User> findByLogin(String login);
    boolean save(LoginDto loginDto);
}
