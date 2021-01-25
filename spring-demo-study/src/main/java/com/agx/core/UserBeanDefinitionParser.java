package com.agx.core;

import com.agx.User;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.AbstractSingleBeanDefinitionParser;
import org.springframework.util.StringUtils;
import org.w3c.dom.Element;

/**
 * 2021/1/25 上午10:32
 * aiguoxin
 * 说明:
 */
public class UserBeanDefinitionParser extends AbstractSingleBeanDefinitionParser {

	@Override
	protected Class<?> getBeanClass(Element element){
		return User.class;
	}

	@Override
	protected void doParse(Element element, BeanDefinitionBuilder builder) {

		String uid = element.getAttribute("uid");
		String name = element.getAttribute("name");

		//把对应的属性设置到bean中
		if(StringUtils.hasText(uid))
			builder.addPropertyValue("uid", uid);

		if(StringUtils.hasText(name))
			builder.addPropertyValue("name", name);

	}
}
