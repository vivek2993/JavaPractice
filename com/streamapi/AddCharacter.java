package com.streamapi;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Add 1 char (_) after every 10 in string 
 */
public class AddCharacter {

	
	public static void main(String[] args) {
		
		String str="wehavetoaddnewcharacterinthisstring"; 
		
		usingStreamAPI(str);
		normalway(str);
	}
	public static void usingStreamAPI(String str) {
	 
	     String result = IntStream.range(0, str.length())
                 .mapToObj(i -> (i > 0 && i % 10 == 0) ? "_" + str.charAt(i) : str.charAt(i)+"")
                 .collect(Collectors.joining());
	     System.out.println(result);
		
	}
	
	public static void normalway(String str) {
		
		StringBuilder builder=new StringBuilder(str);
		
		for(int i=10;i<builder.length();i=i+11) {
			
			builder.insert(i, "_");
		}
		System.out.println(builder.toString());
	}
}
