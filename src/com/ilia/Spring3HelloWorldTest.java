package com.ilia;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public  class Spring3HelloWorldTest {
	public static void main(String[] args) {

		System.out.println("============= Hello World Test =============");		
		@SuppressWarnings("deprecation")
		XmlBeanFactory beanFactory 	= new XmlBeanFactory(new ClassPathResource("SpringHelloWorld.xml"));
		Spring3HelloWorld myBean 	= (Spring3HelloWorld) beanFactory.getBean("Spring3HelloWorldBean");
		myBean.sayHello();

		System.out.println("============= Parameters Injection Test =============");	
		InjectBean injectBean = (InjectBean) beanFactory.getBean("InjectBean");
		System.out.println(injectBean);			

		System.out.println("============= Inheritance Test =============");	
		System.out.println(beanFactory.getBean("InheritanceParent"));		
		System.out.println(beanFactory.getBean("InheritanceChild1"));			
		System.out.println(beanFactory.getBean("InheritanceChild2"));			
	}
}