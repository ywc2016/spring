package com.buaa.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Bean懒加载
 * 
 * @param args
 */
public class Bean3 {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Bean3() {
		System.out.println("Bean3的实例被创建.");
	}

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"applicationContext.xml");// 读取bean.xml中的内容
		Bean3 bean3 = ctx.getBean("bean3", Bean3.class);
	}

}
