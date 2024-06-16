package com.stringprogram;

public class Swap2NumWithoutTemp {

	public static void main(String[] args) {
		int a=2;
		int b=5;


		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println(a+"  "+b);
	}
}
