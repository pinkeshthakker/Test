package com.test.training;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Spring3HelloWorldScopeTest {

	public static void main(String[] args) {
		
	org.springframework.context.ApplicationContext applicationContext = new org.springframework.context.support.ClassPathXmlApplicationContext("SpringHelloWorldProxy.xml");
	PrototypExample prototypExample = (PrototypExample) applicationContext.getBean("prototypExample");
	prototypExample.setDisplay("test");
	PrototypExample prototypExample2 = (PrototypExample) applicationContext.getBean("prototypExample");
	System.out.println("Value in another bean::"+ prototypExample2.getDisplay());
	
	//Singltone test
	
	SingltoneExample singltoneExample = (SingltoneExample) applicationContext.getBean("singltoneExample");
	singltoneExample.setDisplay("test");
	SingltoneExample singltoneExample2 = (SingltoneExample) applicationContext.getBean("singltoneExample");
	System.out.println("Value in another bean::"+ singltoneExample2.getDisplay());
}

}
