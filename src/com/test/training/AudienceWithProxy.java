package com.test.training;
import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.stereotype.Component;
@Component("audienceWithProxy")
public class AudienceWithProxy implements MethodBeforeAdvice {
	
	public void before(Method method, Object[] objects, Object object)throws Throwable {
		System.out.println("Currently Processing " + method);
}




}
