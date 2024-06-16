//Write a java program to find a missing number in an integer array?
package com.arrayprogram;

 import java.util.Arrays;
 
public class MissingNo
{
   
	public static void main(String[] arg)
	{
		int[] a = {1, 4, 5, 3, 2, 8, 6};
		int n=8;
		int sum=n*(n+1)/2;
		int sum1=0;
		
		for(int i=0;i<a.length;i++)
		{	
			sum1=sum1+a[i];
		}
		int missing=sum-sum1;

		System.out.println("missing element is "+missing);
		
	}
}