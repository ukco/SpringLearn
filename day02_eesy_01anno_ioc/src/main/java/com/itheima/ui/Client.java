package com.itheima.ui;

import com.itheima.dao.IAccountDao;
import com.itheima.service.IAccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author lyr
 * @Date 2020/10/8 21:13
 * @Version 1.0
 * @Description 模拟一个表现层，用户调用业务层
 */
public class Client {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // 1. 获取核心容器对象
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        // 2. 根据id获取bean对象
        IAccountService as = (IAccountService) ac.getBean("accountService");
//        System.out.println(as);
//
//        IAccountDao adao = ac.getBean("accountDao", IAccountDao.class);
//        System.out.println(adao);

        as.saveAccount();
        ac.close();
    }
}