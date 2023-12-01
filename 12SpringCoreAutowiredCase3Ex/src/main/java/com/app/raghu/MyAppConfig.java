package com.app.raghu;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration //this annotation says that i am configuration class so that i can directly input the code to spring container.
@ComponentScan("com.app.raghu")
public class MyAppConfig {

	//1 method = 1 object
	@Bean
	@Primary  //used for the first Priority.if u have @Qualifier() then Qualifier will be the first Priority.
	public MyRepository m1() 
	{
		MyRepository m1 = new MyRepository();
		m1.setCode("A");
		return m1;
	}
	
	@Bean
	public MyRepository m2() 
	{
		MyRepository m2 = new MyRepository();
		m2.setCode("B");
		return m2;
	}
}
//@Configuration is used when if a class is pre-defined
//This annotation also used for create single object or multiple object of programmer class.

//@Bean: used for both programmer defined class and pre-defined class for object creation..it support multiple object creation
//@Component:used for pre-defined class for object creation.....it support only one object creation 