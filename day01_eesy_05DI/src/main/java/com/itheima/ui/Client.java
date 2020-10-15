package com.itheima.ui;

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
     *
     * @param args
     */
    public static void main(String[] args) {
        // 1. 获取核心容器对象
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        // ApplicationContext ac = new FileSystemXmlApplicationContext("E:\\lyr_projects\\SpringLearn\\day01_eesy_03spring\\src\\main\\resources\\bean.xml");
        // 2. 根据id获取bean对象
//        IAccountService as = (IAccountService) ac.getBean("accountService");
//        as.saveAccount();

//        IAccountService as = (IAccountService) ac.getBean("accountService2");
//        as.saveAccount();

        IAccountService as = (IAccountService) ac.getBean("accountService3");
        as.saveAccount();
    }
}
