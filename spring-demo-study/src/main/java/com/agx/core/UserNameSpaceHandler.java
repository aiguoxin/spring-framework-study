package com.agx.core;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

/**
 * 2021/1/25 上午10:31
 * aiguoxin
 * 说明:
 */
public class UserNameSpaceHandler extends NamespaceHandlerSupport {
	@Override
	public void init() {
		registerBeanDefinitionParser("user",new UserBeanDefinitionParser());
	}
}
