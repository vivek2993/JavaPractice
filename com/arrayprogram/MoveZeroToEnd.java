package com.arrayprogram;
import java.util.*;
class MoveZeroToEnd
{
	public static void main(String[] arg)
	{
		int[] a={1,2,4,5,0,7,8,9,0,3};
		
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!= 0)
			{
				a[count]=a[i];
				count++;
			}
		}
		while(count<a.length)
		{
			a[count]=0;
			count++;
		}
		
		
			System.out.print(Arrays.toString(a));
		
	}
}