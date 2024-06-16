package com.streamapi;

import java.util.Arrays;

public class FindNthHighestFromArray {

	public static void main(String[] args) {

		int nth=2;
		Integer[] arr= {7,8,6,9,11};
		
		Integer integer = Arrays.stream(arr).sorted().skip(nth).findFirst().get();
		System.out.println(integer);
		 
		 
	}
}
