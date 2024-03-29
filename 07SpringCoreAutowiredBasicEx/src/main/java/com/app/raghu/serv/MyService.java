package com.app.raghu.serv;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.app.raghu.repo.MyRepository;

@Component
public class MyService 
{
	
	@Autowired
	private MyRepository repo; //HAS-A
	
	@Override
	public String toString()
	{
		return "MyService [repo=" + repo + "]";
	}
	
	
}
