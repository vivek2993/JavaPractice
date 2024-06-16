package com.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * in this class we will find the even number present in the ArrayList
 */
public class FindEvenNumber {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(5,10,15,35,28);
		
		List<Integer> collect = list.stream().filter(even-> even%2==0).collect(Collectors.toList());
		
		System.out.println(collect);
	}
}
