package com.desginpattern.singleton;

public class MainClassForEnum {
	 public static void main(String[] args) {
	        SingletonEnum singleton = SingletonEnum.instance;

	        System.out.println(singleton.getId());
	        singleton.setId("2");
	        System.out.println(singleton.getId());
	    }
}
