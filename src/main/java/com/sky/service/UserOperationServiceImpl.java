package com.sky.service;

import com.sky.dao.UserOperationMapper;
import com.sky.domain.Money;
import com.sky.domain.ZhuanZhang;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserOperationServiceImpl implements UserOperationService{

    @Autowired
    private UserOperationMapper userOperationMapper;

    @Override
    public List<Money> selectAllWithdrawal(String name) {
        return userOperationMapper.selectAllWithdrawal(name);
    }

    @Override
    public List<Money> selectAllDeposit(String name) {
        return userOperationMapper.selectAllDeposit(name);
    }

    @Override
    public List<ZhuanZhang> selectTransferAccounts(String bankcard) {
        return userOperationMapper.selectTransferAccounts(bankcard);
    }
}
