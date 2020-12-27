package com.sky.service;

import com.sky.dao.RoleFunctionMapper;
import com.sky.domain.RoleFunction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleFunctionServiceImpl implements RoleFunctionService {

    @Autowired
    private RoleFunctionMapper roleFunctionMapper;
    @Override
    public List<RoleFunction> getFunctionByRoleId(Integer id) {
        return roleFunctionMapper.getFunctionByRoleId(id);
    }
}
