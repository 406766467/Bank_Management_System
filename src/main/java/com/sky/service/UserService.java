package com.sky.service;

import com.sky.domain.User;
import org.apache.ibatis.annotations.Param;

public interface UserService {
    User login(@Param("username") String username, @Param("password") String password);
}
