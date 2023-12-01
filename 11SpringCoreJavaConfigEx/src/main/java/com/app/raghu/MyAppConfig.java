package com.app.raghu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration//this annotation says that i am configuration class so that i can directly input the code to spring container.
@PropertySource("classpath:jdbc.properties")
public class MyAppConfig 
{
	
	@Autowired
	private Environment env;

	//1 method = 1 object
	@Bean
	public MyDriverManager conObj() 
	{
		MyDriverManager dm = new MyDriverManager();
		dm.setDriverClass(env.getProperty("my.driver"));
		dm.setUrl(env.getProperty("my.url"));
		return dm;
	}
}
//@Configuration is used when if a class is pre-defined
//This annotation also used for create single object or multiple object of programmer class.

//@Bean: used for both programmer defined class and pre-defined class for object creation..it support multiple object creation
//@Component:used for pre-defined class for object creation.....it support only one object creation 
