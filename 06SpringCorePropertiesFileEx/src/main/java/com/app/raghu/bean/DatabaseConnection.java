package com.app.raghu.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("con")
public class DatabaseConnection {

	@Value("${my.grade.id}")
	private int code;
	
	@Value("${my.db.driver}")
	private String driver;
	@Value("${my.db-url}")
	private String url;
	@Value("${my.db_user}")
	private String userName;
	@Value("${my.db-pwd}")
	private String userPwd;
	@Override
	public String toString() {
		return "DatabaseConnection [code=" + code + ", driver=" + driver + ", url=" + url + ", userName=" + userName
				+ ", userPwd=" + userPwd + "]";
	}
	
	
	
	
	
	
}
