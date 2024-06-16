package com.leetcode;

/**
 * In this class we are performing 2 type of searching
 * 
 * Linear Search-> array does not need to be sorted
 * 				   check the target with every element whether it is matching or not
 * 
 * Binary Search-> it is applicable to sorted array only
 * 				   set the left and right and find the middle of the element than
 * 				   check wherether element match with target or not
 */
public class Searching {

	
	public static void main(String[] args) {
		
		int[] array= {2,5,7,8,6,4};
		
		int target=6;
		
		int linearSearch = linearSearch(array,target);
		System.out.println("Linear Search:::::::::Target Element at "+linearSearch);
		
		int[] array1= {2,5,6,7,8,9};
		int binarySearch = binarySearch(array1,target);
		System.out.println("Binary Search:::::::::Target Element at "+binarySearch);
	}

	private static int linearSearch(int[] array, int target) {
		 
		for(int i=0;i<array.length;i++) {
			
			if(array[i]==target) {
				return i;
			}
		}
		return -1;
		
	}
	private static int binarySearch(int[] array, int target) {
		  
		
		int left=0;
		int right=array.length-1;
		
		while(left <=right) {
			
			int mid=(left+right)/2;
			
			if(array[mid]==target)
				return mid;
			else if(array[mid] < target)
				left=mid+1;
			else
				right=mid-1;
			
		}
		return -1;
	}


 
}
