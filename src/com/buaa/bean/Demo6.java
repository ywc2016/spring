package com.buaa.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 基于注解的自动装配
 * 
 * @author ywcrm
 * 
 */
public class Demo6 {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"beans4.xml");// 读取bean.xml中的内容
		Person pserson = (Person) ctx.getBean("person");
		Dog dog = (Dog)ctx.getBean("dog");
		Dog dog2 = (Dog)ctx.getBean("dog2");
		
		dog.setName("大黄");
		dog2.setName("小白");
		
		pserson.call();
	}
}
