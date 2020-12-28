package com.sky.service;

import com.sky.domain.Money;
import com.sky.domain.ZhuanZhang;

import java.util.List;

public interface UserOperationService {
    List<Money> selectAllWithdrawal(String name);
    List<Money> selectAllDeposit(String name);
    List<ZhuanZhang> selectTransferAccounts(String bankcard);
}
