package com.streamapi;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * In this class we will create a single array from 2 array in sort manner
 */
public class MergeArrayAndSort {

	public static void main(String[] args) {
		 int[] a1= {1,3,5,7};
		 int[] a2= {2,4,6,8};
		 
		 Stream.of(a1,a2).flatMapToInt(e-> Arrays.stream(e)).sorted().forEach(e->System.out.println(e));;
	}
}
