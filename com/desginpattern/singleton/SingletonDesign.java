package com.desginpattern.singleton;

/**
 * In singteton design pattern only one instance can be created
 */
public class SingletonDesign {

	private static SingletonDesign instance;
	
	
	private SingletonDesign() {
		
	}
	
	public static SingletonDesign getInstance() {
		
		if(instance==null) {
			
			synchronized(SingletonDesign.class) {
				
				if(instance==null) {
					instance=new SingletonDesign();
				}
			}
			
		}
		return instance;
	}
}
