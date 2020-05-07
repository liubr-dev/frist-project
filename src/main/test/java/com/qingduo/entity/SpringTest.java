package com.qingduo.entity;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * SpringTest
 *
 * @author liubr
 * @date 2020-02-10 16:53:54
 **/
public class SpringTest {

    public static void main(String[] args) {
        //加载spring容器
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("spring-001.xml");
        //使用bean的id查找对象
        User user = (User) classPathXmlApplicationContext.getBean("user1");
        System.out.println(" user = " + user );
    }
}