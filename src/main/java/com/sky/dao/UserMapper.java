package com.sky.dao;

import com.sky.domain.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {

    User login(@Param("username") String username, @Param("password") String password);

}
