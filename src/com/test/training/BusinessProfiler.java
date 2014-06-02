package com.test.training;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class BusinessProfiler 
{
	        @Pointcut("execution(* com.nihilent.training.*.*(..))")
	        public void businessMethods() { }

	        @Before("businessMethods()")
	        public void execute() throws Throwable {
	                System.out.println("Before Method test");
	        }

}


