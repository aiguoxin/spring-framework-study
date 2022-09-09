package com.agx.core.injectgeneric;

import org.springframework.stereotype.Component;

/**
 * 9/9/22 17:25
 * aiguoxin
 * 说明:
 */
@Component
public class B implements GenericValidator<Bbean> {
    @Override
    public Bbean validate(Bbean object) {
        return object;
    }
}
