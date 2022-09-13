package com.agx.core;

import com.agx.User;
import com.agx.core.provider.WindowGenerator;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

/**
 * 2021/1/25 上午8:52
 * aiguoxin
 * 说明:
 * 1、获取资源
 * 2、获取beanfactory
 * 3、资源解析，注入（放到CurrentHashMap中）
 *
 * 如何自定义xml标签，并解析呢？https://github.com/dchjmichael/notes/blob/master/spring/schema/Spring%E6%89%A9%E5%B1%95.md
 *
 * 如何解决循环依赖问题？
 * 只能处理单例，不能处理原型模式，因为单例使用了缓存，并且不等bean创建完，就把ObjectFactory加入缓存。
 * 这样一旦下一个 bean 创建的时候需要依赖 bean 时则直接使用 ObjectFactroy。
 */
public class BeanTest {

	public static void main(String[] args) {
		ClassPathResource resource = new ClassPathResource("bean.xml");
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions(resource);

//		User user = factory.getBean(User.class);
		User user = (User) factory.getBean("user");
		System.out.println("user name="+ user.getName());

		WindowGenerator windowGenerator = (WindowGenerator)factory.getBean("windowGenerator");
		for(int i=0;i<5;i++	){
			System.out.println(windowGenerator.generateWindow());
		}
	}
}
