package com.buaa.bean;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Demo {
	public static void main(String[] args) {
		
		// 在 Spring 中，有大量对 BeanFactory 接口的实现。其中，最常被使用的是 XmlBeanFactory 类。这个容器从一个
		// XML 文件中读取配置元数据，由这些元数据来生成一个被配置化的系统或者应用。
		// 在资源宝贵的移动设备或者基于 applet 的应用当中， BeanFactory 会被优先选择。否则，一般使用的是 ApplicationContext，除非你有更好的理由选择 BeanFactory。
		
		// Resource rs = new ClassPathResource("applicationContext.xml");
		// BeanFactory factory = new XmlBeanFactory(rs);
		// HelloBean helloBean = (HelloBean) factory.getBean("helloBean");
		// System.out.println(helloBean.getHelloWorld());

		// Application Context 是 spring 中较高级的容器。和 BeanFactory 类似，它可以加载配置文件中定义的
		// bean，将所有的 bean 集中在一起，当有请求的时候分配 bean。
		// 另外，它增加了企业所需要的功能，比如，从属性文件从解析文本信息和将事件传递给所指定的监听器。这个容器在
		// org.springframework.context.ApplicationContext interface 接口中定义。
		// ApplicationContext 包含 BeanFactory 所有的功能，一般情况下，相对于
		// BeanFactory，ApplicationContext 会被推荐使用。BeanFactory
		// 仍然可以在轻量级应用中使用，比如移动设备或者基于 applet 的应用程序。
		// 最常被使用的 ApplicationContext 接口实现:

		// ClassPathXmlApplicationContext：该容器从 XML 文件中加载已被定义的 bean。在这里，你不需要提供
		// XML 文件的完整路径，只需正确配置 CLASSPATH 环境变量即可，因为，容器会从 CLASSPATH 中搜索 bean 配置文件。
		// WebXmlApplicationContext：该容器会在一个 web 应用程序的范围内加载在 XML 文件中已被定义的 bean。

		// ApplicationContext ctx = new ClassPathXmlApplicationContext(
		// "applicationContext.xml");// 读取bean.xml中的内容
		// HelloBean helloBean2 = ctx.getBean("helloBean", HelloBean.class);//
		// 创建bean的引用对象
		// System.out.println(helloBean2.getHelloWorld());

		// FileSystemXmlApplicationContext：该容器从 XML 文件中加载已被定义的
		// bean。在这里，你需要提供给构造器 XML 文件的完整路径

		ApplicationContext context = new FileSystemXmlApplicationContext(
				"F:/Workspaces/MyEclipse Professional 2014/spring/src/applicationContext.xml");
		HelloBean helloBean3 = context.getBean("helloBean", HelloBean.class);
		System.out.println(helloBean3.getHelloWorld());
	}
}
