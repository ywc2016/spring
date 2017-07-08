package com.buaa.bean;

import javax.security.auth.Destroyable;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Bean生命周期
 * 
 * @param args
 */
public class Bean4 implements BeanNameAware, BeanFactoryAware,
		ApplicationContextAware, InitializingBean {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");// 读取bean.xml中的内容
		Bean4 bean4 = ctx.getBean("bean4", Bean4.class);
		((AbstractApplicationContext) ctx).registerShutdownHook();// 关闭ctx,方法在AbstractApplicationContext接口中
	}

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("setName方法被调用");
		this.name = name;
	}

	public Bean4() {
		System.out.println("Bean4的实例被创建.");
	}

	public void init() {
		System.out.println("init方法被调用");
	}

	public void destroy() {
		System.out.println("destroy方法被调用");

	}

	@Override
	public void setBeanName(String arg0) {
		System.out.println("setBeanName方法被调用.");
	}

	@Override
	public void setBeanFactory(BeanFactory arg0) throws BeansException {
		System.out.println("setBeanFactory方法被调用.");
	}

	@Override
	public void setApplicationContext(ApplicationContext arg0)
			throws BeansException {
		System.out.println("setApplicationContext方法被调用.");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet方法被调用.");

	}

}
