package com.itheima.factory;

/**
 * @Author lyr
 * @Date 2020/10/8 21:17
 * @Version 1.0
 * @Description
 */

import java.io.InputStream;
import java.util.Map;
import java.util.Properties;

/**
 * 一个创建Bean对象的工程
 *
 * Bean在计算机英语中，有可重用组件的含义。
 * JavaBean:用java语言编写的可重用组件。
 *      javabean == 实体类  它不等 其实是 javabean > 实体类
 * 它就是创建我们的service和dao对象的。
 *
 * 第一个：需要一个配置文件来配置我们的service和dao
 *       配置的内容：唯一标识=全限定类名（key=value）
 * 第二个：通过读取配置文件中配置的内容，反射创建对象
 *
 * 我的配置文件可以是xml也可以是properties
 */
public class BeanFactory {
    // 定义一个Properties对象
    private static Properties props;

    // 定义一个Map，用于存放我们要创建的对象。我们把它称为容器
    // 这样就能保证对象只被创建了一次，就是单例的了
    private static Map<String, Object> beans;

    // 使用静态代码块为Properties对象赋值
    static {
        try {
            // 实例化对象
            props = new Properties();
            // 获取properties文件的流对象
            InputStream in = BeanFactory.class.getClassLoader().getResourceAsStream("bean.properties");
            props.load(in);
        } catch (Exception e) {
            throw new ExceptionInInitializerError("初始化properties失败!");
        }
    }

    /**
     * 根据bean的名称获取对象
     * @param beanName
     * @return
     */
    public static Object getBean(String beanName) {
        Object bean = null;
        try {
            String beanPath = props.getProperty(beanName);
            bean = Class.forName(beanPath).newInstance(); // 用反射的方式创建对象，每次都会调用默认构造函数创建对象
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bean;
    }
}