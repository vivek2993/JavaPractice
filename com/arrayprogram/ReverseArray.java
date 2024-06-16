//Write a java program to reverse an array without using an additional array?
package com.arrayprogram;

import java.util.Arrays;
 
public class ReverseArray 
{  
	public static void main(String[] arg)
	{
		int[] a={4, 5, 8, 9, 10,12};
		
		int temp;
		
		for(int i=0;i<a.length/2;i++)
		{
			temp=a[i];
			a[i]=a[a.length-1-i];
			a[a.length-1-i]=temp;
		}
		System.out.println("Array After Reverse : "+Arrays.toString(a));
		
	}
  
}