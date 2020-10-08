package com.itheima.dao.impl;

import com.itheima.dao.IAccountDao;

/**
 * @Author lyr
 * @Date 2020/10/8 21:09
 * @Version 1.0
 * @Description 账户的持久层实现类
 */
public class AccountDaoImpl implements IAccountDao {
    public void saveAccount(){
        System.out.println("保存了账户");
    }
}
