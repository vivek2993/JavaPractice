//Find Duplicate Element in this program
package com.arrayprogram;

import java.util.Set;
import java.util.HashSet;

class DuplicateElement
{
	public static void main(String s1[])
	{
		int[] a={1,2,5,2,4,1};
		HashSet<Integer> s=new HashSet<>();
		for(int no:a)
		{
			boolean b=s.add(no);
			if(b== false) 
			{
			System.out.println(no);
			}
		}
	}
	/*	public static void main(String s1[])
	{
		String[] a={"aa","ab","ac","aa"};
		Set<String> s=new HashSet<String>();
		for(String no:a)
		{
			boolean b=s.add(no);
			if(b== false) 
			{
			System.out.println(no);
			}
		}
	}*/
}