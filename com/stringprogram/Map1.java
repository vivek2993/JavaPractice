package com.stringprogram;
import java.util.*;
class Map1
{
	public static void main(String[] arg)
	{
		String s="vivek";
		char[] a=s.toCharArray();
		 int len=a.length;
		Map<Character,Integer> m=new LinkedHashMap<Character,Integer>();  //to get in present sequence
	     //Map<Character,Integer> m=new HashMap<Character,Integer>(); // Random result
		//Map<Character,Integer> m=new TreeMap<Character,Integer>(); // Ascending order
		int i=0;
		
		while(i!=len)
		{
			if(m.containsKey(a[i])== false)
			{
				m.put(a[i],1);
			}
			else
			{
				int old=m.get(a[i]);
				int neww=old+1;
				m.put(a[i],neww);
			}
			i++;
		}
		
		for(Map.Entry<Character,Integer> data:m.entrySet())
		{
			System.out.println(data.getKey()+"="+data.getValue());
			//System.out.println();
		}
		
		
	}
}