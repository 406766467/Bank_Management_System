package com.sky.dao;

import com.sky.domain.Money;
import com.sky.domain.User;

import java.util.List;

public interface UserOperationMapper {
    List<Money> selectAllWithdrawal(String name);
    List<Money> selectAllDeposit(String name);
}
