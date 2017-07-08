package com.buaa.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Person {

	private Dog dog;

	public Dog getDog() {
		return dog;
	}

	@Autowired
	public void setDog(Dog dog) {
		this.dog = dog;
	}

	public Person() {
		System.out.println("无参构造方法创建了一个Person的对象.");
	}

	public Person(Dog dog) {
		System.out.println("有参构造方法创建了一个Person的对象.");
		this.dog = dog;
	}

	public void call() {
		System.out.println("召唤我的狗..." + dog.getName());
		dog.cry();
	}

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"beans2.xml");// 读取bean.xml中的内容
		Person pserson = (Person) ctx.getBean("person");
		pserson.call();
	}
}