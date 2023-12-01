package com.app.raghu.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test 
{

	public static void main(String[] args)
	{
		
		//1. first create empty container
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(com.app.raghu.config.MyAppConfig.class);
		
		// read object
		Object ob = ac.getBean("eobj");
		
		// print object
		System.out.println("EmailConfig:"+ob); //obtoString()
		
		// read object
		Object ob2 = ac.getBean("vr");
		
		// print object
		System.out.println("ViewResolver:"+ob2); //obtoString()
	}
}
