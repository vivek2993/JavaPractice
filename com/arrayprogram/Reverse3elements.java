package com.arrayprogram;

import java.util.Arrays;

/**
 * Reverse every 3 element in the array
 * Example-
 * 				I/P – {1,2,3,4,5,6,7,8,9}
 *				O/P - {3,2,1,6,5,4,9,8,7}
 */
public class Reverse3elements {

	public static void main(String[] args) {
		
		int[] num={1,2,3,4,5,6,7,8,9};
		reverseElements(num);
	}
	
	public static void reverseElements(int[] num) {
		
		
		for(int i=0;i<num.length;i=i+3) {
			
			int left=i;
			int right=Math.min(i+2, num.length-1);
			
			while(left<right) {
				
				int temp=num[left];
				num[left]=num[right];
				num[right]=temp;
				
				left++;
				right--;
			}
		}
		System.out.println("Reverse elements are:::::::;;;");
		System.out.println(Arrays.toString(num));
	}
}
