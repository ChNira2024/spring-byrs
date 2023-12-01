package com.app.raghu;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

// you can write annotation in any order
@ComponentScan(basePackages = "com.app.raghu") //find the class in current package and sub-package
@PropertySource("classpath:myapp.properties") //if u using .properties file for injecting value then us this annotation
public class MyAppConfig {

}
