package com.itheima.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * @Author lyr
 * @Date 2020/10/6 21:08
 * @Version 1.0
 * @Description 程序的耦合
 */
public class JdbcDemo1 {
    public static void main(String[] args) throws Exception {
        //1.注册驱动
        //DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        //如果没有com.mysql.jdbc.Driver驱动类，直接编译错误 -----编译期
        Class.forName("com.mysql.jdbc.Driver");
        //2.获取连接
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/eesy?useUnicode=true&characterEncoding=utf8","root","ukco1997");
        //Connection conn = DriverManager.getConnection("jdbc:mysql://aifuture.uestc.cn:11306/que?useSSL=false&useUnicode=true&characterEncoding=utf-8&useLegacyDatetimeCode=false&serverTimezone=Asia/Shanghai","deepeduadmin","Admin@2019");
    }
}
