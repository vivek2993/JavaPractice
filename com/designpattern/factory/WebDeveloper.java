package com.designpattern.factory;

public class WebDeveloper implements Employee{

	@Override
	public int salary() {
		System.out.println("WebDeveloper class called");
		return 50000;
	}
	
	
}
