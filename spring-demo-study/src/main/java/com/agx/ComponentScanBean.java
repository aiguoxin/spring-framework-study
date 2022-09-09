package com.agx;

import lombok.Data;
import lombok.ToString;
import org.springframework.stereotype.Component;

/**
 * 7/14/22 15:10
 * aiguoxin
 * 说明:
 */
@Data
@ToString
@Component("componentScanBean")
public class ComponentScanBean {
    /**field注入**/
    //    @Autowired
    private User user;

    /**construtor注入**/
//    public ComponentScanBean(User user){
//        this.user = user;
//    }

    private String name = "ComponentScanBean";

    /**setter注入**/
//    @Autowired
//    public void setUser(User user) {
//        this.user = user;
//    }


    public void print() {
        System.out.println(user.getName());
    }
}
