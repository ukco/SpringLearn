package com.itheima.ui;

import com.itheima.factory.BeanFactory;
import com.itheima.service.IAccountService;

/**
 * @Author lyr
 * @Date 2020/10/8 21:13
 * @Version 1.0
 * @Description 模拟一个表现层，用户调用业务层
 */
public class Client {
    public static void main(String[] args) {
        // IAccountService as = new AccountServiceImpl();
        for (int i = 0; i < 5; ++i) {
            IAccountService as = (IAccountService) BeanFactory.getBean("accountService");
            System.out.println(as);
        }
        // as.saveAccount();
    }
}
