//Find min value element in given array
package com.arrayprogram;

class MinValue
{
	public static void main(String s[])
	{
		int[] a={3,5,9,2,4,7};
		int min=a[0];
		
		for(int i=1;i<a.length;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		System.out.print("Minimum value in this array:"+min);
	}
}