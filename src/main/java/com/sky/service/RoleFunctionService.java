package com.sky.service;

import com.sky.domain.RoleFunction;

import java.util.List;

public interface RoleFunctionService {

    List<RoleFunction> getFunctionByRoleId(Integer id);
}
