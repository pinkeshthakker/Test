package com.test.training;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Spring3HelloWorldConfigTest {

	public static void main(String[] args) {
        //Initialize IoC Container
		//AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
				//Spring3HelloWorldConfig.class);
		//AnnotationConfigApplicationContext contextFromXml = new AnnotationConfigApplicationContext(
			//	"SpringHelloWorld.xml");
		
		org.springframework.context.ApplicationContext context1 = new org.springframework.context.support.ClassPathXmlApplicationContext("SpringHelloWorld.xml");
		Spring3HelloWorld myBean = (Spring3HelloWorld) context1.getBean("Spring3HelloWorld");
		myBean.sayHello();
		System.out.println("Calling Bean method: sayHello()");
		
		Spring3HelloWorldPerfrom perromtest = (Spring3HelloWorldPerfrom) context1.getBean("spring3HelloWorldPerfrom");
		perromtest.perform();
		//Retrieve the bean from Container
		/*Spring3HelloWorld myBean = (Spring3HelloWorld) context
				.getBean("spring3HelloWorld");
		myBean.sayHello();*/

	}

}
