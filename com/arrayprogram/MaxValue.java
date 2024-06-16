//Find max value element in given array
package com.arrayprogram;

class MaxValue
{
	public static void main(String[] s)
	{
		int[] a={3,5,9,59,4,58};
		int max=a[0];
		
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.print("Maximum value in this array:\n"+max);
	}
}