package com.yuan.ui;

import com.yuan.dao.AccountDao;
import com.yuan.service.AccountService;
import com.yuan.service.impl.AccountServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
        * 模拟一个表现层，用于调用业务层
        */
public class Client {
/**
 *
 * @param args
 */
    public static void main(String[] args) {
        //1.获取核心容器对象
        ApplicationContext ac=new ClassPathXmlApplicationContext("bean.xml");
        //2.根据id获取Bean对象
        AccountService as=(AccountService)ac.getBean("accountServiceImpl");
        as.saveAccount();
    }
}
