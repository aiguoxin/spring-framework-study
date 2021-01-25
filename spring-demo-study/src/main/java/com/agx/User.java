package com.agx;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * 2020/6/22 下午3:30
 * aiguoxin
 * 说明:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User {
    private long uid;
    private String name;


}
