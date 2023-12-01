package com.app.raghu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class TokenService //This is dependent bean having singleton
{

	@Autowired // Field Injection 
	private Token token; //here this is dependency bean having prototype
	
	public Token getToken() 
	{
		return token;
	}
	
	@Override
	public String toString() {
		return "TokenService [token=" + token + "]";
	}
	
	
}
