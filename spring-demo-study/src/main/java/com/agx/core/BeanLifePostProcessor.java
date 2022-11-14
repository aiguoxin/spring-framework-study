package com.agx.core;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * 11/14/22 16:35
 * aiguoxin
 * 说明:
 */
public class BeanLifePostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("----------->5.调用BeanLifePostProcessor#postProcessBeforeInitialization");
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("----------->8.调用BeanLifePostProcessor#postProcessAfterInitialization");
        return bean;
    }
}
