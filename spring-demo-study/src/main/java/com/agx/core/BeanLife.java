package com.agx.core;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;

/**
 * 11/14/22 16:23
 * aiguoxin
 * 说明: Spring Bean life cycle test
 */
public class BeanLife implements InitializingBean, BeanFactoryAware, BeanNameAware, DisposableBean {
    private String name;

    public BeanLife(){
        System.out.println("----------->1.调用构造方法");
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("----------->2.设置属性");
    }

    /*****BeanNameAware与BeanFactoryAware顺序怎么确定的？******/
    @Override
    public void setBeanName(String name) {
        System.out.println("----------->3.调用BeanNameAware#setBeanName");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("----------->4.调用BeanFactoryAware#setBeanFactory");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("----------->6.调用InitializingBean#afterPropertiesSet");
    }

    public void init(){
        System.out.println("----------->7.自定义init方法");
    }


    @Override
    public void destroy() throws Exception {
        System.out.println("----------->9.调用DisposableBean#destroy");

    }

    public void destroyMethod(){
        System.out.println("----------->10.调用自定义的destroy");
    }


}
