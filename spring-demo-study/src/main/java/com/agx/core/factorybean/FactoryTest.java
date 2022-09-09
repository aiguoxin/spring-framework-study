package com.agx.core.factorybean;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

/**
 * 9/9/22 16:28
 * aiguoxin
 * 说明:
 */
public class FactoryTest {
    public static void main(String[] args) {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(ExampleConfig.class);
        String bean = (String) context.getBean("fromFactory");
        System.out.println(bean);

        FactoryBean<String> beanFactory = (FactoryBean<String>) context.getBean("&fromFactory");
        System.out.println(beanFactory);

        /**getBean方法，根据&符号如何查找对应bean的？***/

        /**
         * 根据获取的bean是否&前缀，如果没有，则直接返回实例。有则，返回factorybean中创建的实例。
         * factorybean主要用来创建比较复杂的bean，不然通过xml配置等比较繁琐。
         */
    }
}
