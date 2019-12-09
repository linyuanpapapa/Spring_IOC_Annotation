package com.yuan.dao.impl;

import com.yuan.dao.AccountDao;
import org.springframework.stereotype.Repository;

@Repository
public class AccountDaoImpl implements AccountDao {
    public void saveAccount() {
        System.out.println("保存了对象。。。");
    }
}
