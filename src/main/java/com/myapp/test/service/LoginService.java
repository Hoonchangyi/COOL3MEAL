package com.myapp.test.service;

import com.myapp.test.model.User;

public interface LoginService {
    User getUser(String email); //select

    User getNickname(String nickname);

    int updateUser(User user);
    int insertUser(User user);
    int deleteUser(String email, String password);
}
