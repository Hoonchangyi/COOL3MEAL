package com.myapp.test.mapper;

import com.myapp.test.model.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LoginMapper {
    User getUser(String id); //select

    User getNickname(String nickname);

    int updateUser(User user);
    int insertUser(User user);
    int deleteUser(String id, String password);
}
