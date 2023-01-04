package com.myapp.test.service;

import com.myapp.test.mapper.LoginMapper;
import com.myapp.test.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("loginService")
public class LoginServiceImpl implements LoginService{

    @Autowired
    private LoginMapper loginMapper;

    @Override
    public User getUser(String email) {
        return loginMapper.getUser(email);
    }

    @Override
    public User getNickname(String nickname) {
        return loginMapper.getNickname(nickname);
    }

    @Override
    public int updateUser(User user) {
        return loginMapper.updateUser(user);
    }

    @Override
    public int insertUser(User user) {
        return loginMapper.insertUser(user);
    }

    @Override
    public int deleteUser(String email, String password) {
        return loginMapper.deleteUser(email, password);
    }
}
