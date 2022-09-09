package com.agx.core.injectgeneric;

import com.agx.JavaConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 9/9/22 17:26
 * aiguoxin
 * 说明:  test 注入支持泛型
 */
public class Test {
    public static void main(String[] args) {
        ApplicationContext ac = new AnnotationConfigApplicationContext(JavaConfig.class);
        ValidatorService validatorService = (ValidatorService)ac.getBean("validatorService");
        validatorService.print();
    }
}
