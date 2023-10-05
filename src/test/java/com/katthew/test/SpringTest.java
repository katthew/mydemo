package com.katthew.test;

import com.alibaba.druid.pool.DruidDataSource;
import com.katthew.dao.UserDao;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.Connection;

public class SpringTest {
    @Test
    //测试Socpe
    public void test1(){
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao1=(UserDao)app.getBean("userDao");
        UserDao userDao2=(UserDao)app.getBean("userDao");
        System.out.println(userDao1);
        System.out.println(userDao2);
    }

    @Test
    //测试数据源
    public void test2() throws Exception {
        ComboPooledDataSource dataSource=new ComboPooledDataSource();
        dataSource.setDriverClass("com.mysql.cj.jdbc.Driver");
        dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/mysql?useSSL=false");
        dataSource.setUser("root");
        dataSource.setPassword("123456");
        Connection connection=dataSource.getConnection();
        System.out.println(connection);
        connection.close();

    }

    @Test
    public void test3() throws Exception {
        DruidDataSource dataSource=new DruidDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/mysql?useSSL=false");
        dataSource.setUsername("root");
        dataSource.setPassword("123456");
        Connection connection=dataSource.getConnection();
        System.out.println(connection);
        connection.close();

    }
}
