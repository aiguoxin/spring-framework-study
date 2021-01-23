package com.agx;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 2020/6/22 下午3:36
 * aiguoxin
 * 说明:
 * 编译参考https://blog.csdn.net/riemann_/article/details/106558085
 */
public class Main {

    public static void main(String[] args) {
        ApplicationContext ac = new AnnotationConfigApplicationContext(JavaConfig.class);
        User user = (User)ac.getBean("user");
        System.out.println("user="+user);
    }
}
