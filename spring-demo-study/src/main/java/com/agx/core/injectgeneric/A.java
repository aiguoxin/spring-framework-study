package com.agx.core.injectgeneric;

import org.springframework.stereotype.Component;

/**
 * 9/9/22 17:24
 * aiguoxin
 * 说明:
 */
@Component
public class A implements GenericValidator<Abean> {
    @Override
    public Abean validate(Abean object) {
        return object;
    }
}
