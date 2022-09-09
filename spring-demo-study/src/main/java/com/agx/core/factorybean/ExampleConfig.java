package com.agx.core.factorybean;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 9/9/22 16:27
 * aiguoxin
 * 说明:
 */
@Configuration
public class ExampleConfig {
    @Bean
    public FactoryBean<String> fromFactory(){
        return new ExampleFactoryBean();
    }
}
