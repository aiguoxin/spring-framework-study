package com.agx;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * 2020/6/22 下午3:30
 * aiguoxin
 * 说明:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Service
public class User {

    private long uid=1L;
    private String name="agx";


}
