package com.agx.core.factorybean;

import org.springframework.beans.factory.config.AbstractFactoryBean;

/**
 * 9/9/22 16:26
 * aiguoxin
 * 说明:
 */
public class ExampleFactoryBean extends AbstractFactoryBean<String> {
    @Override
    public Class<?> getObjectType() {
        return String.class;
    }

    @Override
    protected String createInstance() throws Exception {
        return "bean from factory";
    }
}
