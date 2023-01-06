package com.spring.security.service;

import java.util.List;

import com.spring.security.model.User;

public interface UserService {
    public void saveUser(User user);
    public List<Object> isUserPresent(User user);
}