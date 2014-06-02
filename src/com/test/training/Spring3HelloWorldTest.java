package com.test.training;

import java.util.Map;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.util.Assert;

public class Spring3HelloWorldTest {

	public static void main(String[] args) {
		org.springframework.context.ApplicationContext context1 = new org.springframework.context.support.ClassPathXmlApplicationContext("SpringHelloWorldProxy.xml");
		Spring3HelloWorldPerfrom perromtest = (Spring3HelloWorldPerfrom) context1.getBean("audienceWithProxyAOP");
		perromtest.perform();
	}

}
