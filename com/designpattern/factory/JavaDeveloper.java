package com.designpattern.factory;

public class JavaDeveloper implements Employee{

	@Override
	public int salary() {
		System.out.println("JavaDeveloper method called");
		return 80000;
	}

}
