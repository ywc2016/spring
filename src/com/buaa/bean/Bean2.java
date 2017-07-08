package com.buaa.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 测试原型Bean
 * 
 * @param args
 */
public class Bean2 {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Bean2() {
		System.out.println("Bean2的实例被创建.");
	}

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"applicationContext.xml");// 读取bean.xml中的内容
		Bean2 bean2 = ctx.getBean("bean2", Bean2.class);
		Bean2 bean2_2 = ctx.getBean("bean2", Bean2.class);
		System.out.println(bean2);
		System.out.println(bean2_2);
		bean2.setName("李小龙");
		System.out.println("bean2_2的名字是:" + bean2_2.getName());
	}

}
