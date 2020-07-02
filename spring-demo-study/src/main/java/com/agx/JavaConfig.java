package com.agx;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 2020/6/22 下午3:31
 * aiguoxin
 * 说明:
 */
@Configuration
@ComponentScan
public class JavaConfig {

    @Bean
    public User user(){
        return  new User(12312L,"aiguoxin");
    }
}
