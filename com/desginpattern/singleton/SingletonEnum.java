package com.desginpattern.singleton;

public enum SingletonEnum {
	instance;
	
	String id;
	public String getId() {
		
		return id;
	}
	
	public void setId(String id) {
		this.id=id;
	}
	
	
}
 