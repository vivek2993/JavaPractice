package com.arrayprogram;

import java.util.*;
class LongestConsecutive
{
	public static void main(String[] arg)
	{
		int[] a={1,2,3,5,4,8,9,10,5};
		
		HashSet<Integer> hs=new HashSet<>();
		for(int i=0;i<a.length;i++)
		{
			hs.add(a[i]);
		}
		int len=0;
		for(int i=0;i<a.length;i++)
		{
			if(!hs.contains(a[i]-1)){
				
				int no=a[i];
			
				while(hs.contains(no))
				{
					no++;
				}
				if(len<no-a[i])
				{
					len=no-a[i];
				}
			}
		}
		System.out.println("Longest Consecutive no= "+len);
	}
}