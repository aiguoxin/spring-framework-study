package com.agx;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Component;

/**
 * 7/14/22 15:10
 * aiguoxin
 * 说明:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Component("componentScanBean")
public class ComponentScanBean {

    private String name = "ComponentScanBean";
}
