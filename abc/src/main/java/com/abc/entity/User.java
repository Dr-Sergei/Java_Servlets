package com.abc.entity;

public class User {

	private String userName;
	private String password;
	
	public User(){
		
	}
	public User(String name, String pass){
		super();
		this.userName=name;
		this.password=pass;
	}
	
	public String getName() {
		return userName;
	}
	public void setUser(String name) {
		this.userName=name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String pass) {
		this.password=pass;
	}
	
	
}
