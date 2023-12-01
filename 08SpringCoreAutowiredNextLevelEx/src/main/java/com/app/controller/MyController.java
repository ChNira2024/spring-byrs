package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.app.service.MyService;

@Component
public class MyController 
{
	@Autowired				 //object injected automatically becoz bydefault required=true
	//@Autowired(required = false)//if u use this as false,then class object is not injected
	private MyService service; //HAS-A

	@Override
	public String toString() {
		return "MyController [service=" + service + "]";
	}
	
	
}
