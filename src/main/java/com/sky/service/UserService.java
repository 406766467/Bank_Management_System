package com.sky.service;

import com.sky.domain.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserService {
    User login(@Param("username") String username, @Param("password") String password);

    List<User> findUser();
}
