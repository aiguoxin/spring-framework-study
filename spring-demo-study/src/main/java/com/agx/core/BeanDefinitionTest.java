package com.agx.core;

import com.agx.User;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;

/**
 * 2021/2/1 上午8:39
 * aiguoxin
 * 说明:
 */
public class BeanDefinitionTest {
	public static void main(String[] args) {
		DefaultListableBeanFactory context = new DefaultListableBeanFactory();
//		GenericBeanDefinition gbd = new GenericBeanDefinition();
//		gbd.setBeanClass(User.class);
//		MutablePropertyValues mpv = new MutablePropertyValues();
//		mpv.add("uid",12312L);
//
//		gbd.setPropertyValues(mpv);
//		context.registerBeanDefinition("user",gbd);
//		User user = context.getBean(User.class);
//		System.out.println("user uid="+user.getUid());


		BeanDefinitionBuilder builder = BeanDefinitionBuilder.rootBeanDefinition(User.class)
				.addPropertyValue("name","haha");
		context.registerBeanDefinition("agx", builder.getBeanDefinition());
		User agx = (User) context.getBean("agx");
		System.out.println("user name="+agx.getName());
	}
}
