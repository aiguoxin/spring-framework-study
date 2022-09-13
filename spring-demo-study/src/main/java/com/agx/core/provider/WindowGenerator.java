package com.agx.core.provider;

import javax.inject.Provider;

/**
 * 9/13/22 09:48
 * aiguoxin
 * 说明:
 */
public class WindowGenerator {
    private final Provider<Window> windowProvider;

    public WindowGenerator(final Provider<Window> windowProvider){
        this.windowProvider = windowProvider;
    }

    public Window generateWindow(){
        return windowProvider.get();
    }

}
