package com.app.raghu;

public class MyDriverManager {

	private String driverClass;
	private String url;

	public MyDriverManager() {
		super();
	}
	public String getDriverClass() {
		return driverClass;
	}
	public void setDriverClass(String driverClass) {
		this.driverClass = driverClass;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	@Override
	public String toString() {
		return "DriverManager [driverClass=" + driverClass + ", url=" + url + "]";
	}
	
	
}
