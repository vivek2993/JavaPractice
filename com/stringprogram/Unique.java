//Check String contain all unique character or not.
package com.stringprogram;

import java.util.*;
class Unique
{
	public static void main(String arg[])
	{
		String s="hibro";
		char[] c=s.toCharArray();
		
		Map<Character,Integer> map=new LinkedHashMap<Character,Integer> ();
		
		int i=0;
		while(i!=c.length)
		{
			if(map.containsKey(c[i]) == false)
			{
				map.put(c[i],1);
			}
			else
			{
				int oldvalue=map.get(c[i]);
				int newv=oldvalue+1;
				map.put(c[i],newv);
			}
			i++;
		}
		
		for(Map.Entry<Character,Integer> data:map.entrySet())
		{
			if(data.getValue()>1)
			{
			System.out.println("NOT UNIQUE");
			System.exit(0);
			}
		}
		System.out.println("UNIQUE");
	}
}