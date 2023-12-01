package com.app.raghu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MyService 
{
	
	@Autowired
	//@Qualifier("m2") //helps to manual select the Bean class
	private MyRepository repo;

	@Override
	public String toString() 
	{
		return "MyService [repo=" + repo + "]";
	}
	
	
}
