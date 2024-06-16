package com.streamapi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * In this class sorting will be done on the basis of numbe of character present in the string
 * 
 * 
 */
public class SortAsPerNumofChar {

	public static void main(String[] args) {
		
		List<String> list=Arrays.asList("AAAA","BBB","AA","BBBBB");
		
		Comparator<String> c=(a,b)->{
			
			int alength=a.length();
			int blength=b.length();
			
			if(alength<blength) 
				return -1;
			else if(alength > blength)
				return 1;
			else 
				return 0;
		};
		List<String> collect = list.stream().sorted(c).collect(Collectors.toList());
		
		System.out.println(collect);
	}
}
