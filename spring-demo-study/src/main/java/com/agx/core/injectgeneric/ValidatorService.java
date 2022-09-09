package com.agx.core.injectgeneric;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 9/9/22 17:27
 * aiguoxin
 * 说明:
 */
@Service
public class ValidatorService {
    @Autowired
    private GenericValidator<Abean> validator;

    public void print(){
        System.out.println(validator.validate(new Abean()));
    }
}
