package com.streamapi;

import java.util.Arrays;
import java.util.List;

public class FindVowels {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("a","B","c","d","e","i","o","U");
		
		list.stream().filter(s-> "aeiou".indexOf(s) != -1 || "AEIOU".indexOf(s) !=-1).forEach(value->System.out.println(value));
	 
	}
}
