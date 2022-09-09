package com.agx.core.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

/**
 * 9/9/22 18:22
 * aiguoxin
 * 说明:
 */
@Service
public class Single {
    @Autowired
    private Prototype prototype;
    @Autowired
    ApplicationContext applicationContext;

    public void getPrototype(){
        /***单例中调用多例，发现还同一个实例**/
//        System.out.println(prototype);
//
        /***解决方法一：每次通过applicationContext获取多例**/
        System.out.println(applicationContext.getBean(Prototype.class));
    }

}
