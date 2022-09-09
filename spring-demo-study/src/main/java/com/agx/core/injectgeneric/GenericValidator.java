package com.agx.core.injectgeneric;

/**
 * 9/9/22 17:23
 * aiguoxin
 * 说明:
 */
public interface GenericValidator<T> {
    T validate(T object);
}
