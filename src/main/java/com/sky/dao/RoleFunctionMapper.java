package com.sky.dao;

import com.sky.domain.RoleFunction;

import java.util.List;

public interface RoleFunctionMapper {

    List<RoleFunction> getFunctionByRoleId(Integer id);
}
