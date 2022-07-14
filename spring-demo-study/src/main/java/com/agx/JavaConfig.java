package com.agx;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 2020/6/22 下午3:31
 * aiguoxin
 * 说明:
 * @Configuration作用相当于xml中的<beans><beans/>节点
 * @Bean相当于xml中<bean></bean>节点
 * @ComponentScan(basePackages = "com.agx") 扫描com.agx下的@Component实体实例化，所以注入bean，可以采用@Bean和扫描方式
 */
@Configuration
@ComponentScan(basePackages = "com.agx")
public class JavaConfig {

    @Bean
    public User user(){
        return  new User(12312L,"aiguoxin");
    }
}
