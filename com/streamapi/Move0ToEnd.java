package com.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * in this class we have to move all the 0 values at the end
 */
public class Move0ToEnd {

	public static void main(String[] args) {

		int[] arr = { 1, 0, 2, 8, 0, 9 };
 
	 
	 List<Integer> zerolist = Arrays.stream(arr).filter(e-> e==0 ).boxed().collect(Collectors.toList());
	 
	 List<Integer> nonzerolist = Arrays.stream(arr).filter(e-> e!=0).boxed().collect(Collectors.toList());
	 
	 List<Integer> collect = Stream.concat(nonzerolist.stream(), zerolist.stream()).collect(Collectors.toList());
	 
	 System.out.println(collect);
	}
}
