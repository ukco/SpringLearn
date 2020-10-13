package com.itheima.factory;

import com.itheima.service.IAccountService;
import com.itheima.service.impl.AccountServiceImpl;

/**
 * @Author lyr
 * @Date 2020/10/12 22:07
 * @Version 1.0
 * @Description 模拟一个工厂类，该类可能存在于jar包中，我们无法通过修改源码的方式来提供默认构造函数
 */
public class InstanceFactory {
    public IAccountService getAccountService() {
        return new AccountServiceImpl();
    }
}
