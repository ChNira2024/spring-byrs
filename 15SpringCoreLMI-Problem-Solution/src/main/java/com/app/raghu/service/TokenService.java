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
    	token = getMyToken();
		return token;
	}
	
	@Lookup   //Solution:(define one method that return child/dependency class with no body,just return null)
	public Token getMyToken() {
		//....
		return null;
	}

	@Override
	public String toString() {
		return "TokenService [token=" + token + "]";
	}
	
	
}
