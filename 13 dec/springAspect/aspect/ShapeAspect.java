package com.vidhyac.spring.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class ShapeAspect {
	
	@Before("execution(public String getName())")
	public void loggingAdvice(){
		System.out.println("Advice executed before get method executed");
	}
	
}
