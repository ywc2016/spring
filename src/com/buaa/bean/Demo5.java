package com.buaa.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 自动装配
 * 
 * @author ywcrm
 * 
 */
public class Demo5 {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"beans3.xml");// 读取bean.xml中的内容
		Person pserson = (Person) ctx.getBean("person");
		pserson.call();
	}
}
