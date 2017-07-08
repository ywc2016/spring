package com.buaa.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 测试单例Bean
 * 
 * @param args
 */
public class Bean1 {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Bean1() {
		System.out.println("Bean1的实例被创建.");
	}

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"applicationContext.xml");// 读取bean.xml中的内容
		Bean1 bean1 = ctx.getBean("bean1", Bean1.class);
		Bean1 bean1_2 = ctx.getBean("bean1", Bean1.class);
		System.out.println(bean1);
		System.out.println(bean1_2);
		bean1.setName("李小龙");
		System.out.println("bean1_2的名字是:" + bean1_2.getName());
	}

}
