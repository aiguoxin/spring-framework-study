package com.agx.core;

import com.agx.core.scope.Prototype;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Service;

/**
 * 9/9/22 18:28
 * aiguoxin
 * 说明:
 */
@Service
public abstract class Single2 {
    @Lookup
    public abstract Prototype getPro();

    public void getPrototype(){
        Prototype prototype = getPro();
        System.out.println(prototype);
    }


}
