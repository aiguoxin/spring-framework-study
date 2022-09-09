package com.agx.core.scope;

import com.agx.JavaConfig;
import com.agx.core.Single2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 9/9/22 18:24
 * aiguoxin
 * 说明:  解决单例中注入多例，不生效问题
 * <p>
 * There are several solutions to this problem:
 * <p>
 * 1. Use lookup method injection
 * 2. Retrieve a prototype-scoped bean via javax.inject.Provider
 * 3. Retrieve a prototype-scoped bean via org.springframework.beans.factory.ObjectFactory (an equivalent of #2, but with the class that is speciﬁc to Spring)
 * 4. Make a singleton bean container aware via implementing ApplicationContextAware interface
 * <p>
 * Approaches #3 and #4 are generally discouraged, since they strongly tie an app to Spring framework. Thus, they are not covered in this example.
 */
public class Test {
    public static void main(String[] args) {
        ApplicationContext ac = new AnnotationConfigApplicationContext(JavaConfig.class);
        /***
         * test applicationContext
         */
        Single single = (Single) ac.getBean("single");
        for (int i = 0; i < 5; i++) {
            single.getPrototype();
        }

        /**
         * test lookup注解
         */
        Single2 single2 = (Single2) ac.getBean("single2");
        for (int i = 0; i < 5; i++) {
            single2.getPrototype();
        }
    }
}
