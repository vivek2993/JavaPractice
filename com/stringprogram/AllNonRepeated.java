package com.stringprogram;
import java.util.*;

class AllNonRepeated
{
	public static void main(String arg[])
	{
		String s="hi bro how are you";
		char[] c=s.toCharArray();
		
		Map<Character,Integer> map=new LinkedHashMap<Character,Integer> ();
		
		for(int i=0;i<c.length;i++)
		{
			if(map.containsKey(c[i]))
				map.put(c[i],map.get(c[i])+1);
			else
				map.put(c[i],1);
		}
	
		
		for(Map.Entry<Character,Integer> data:map.entrySet())
		{
			if(data.getValue()==1)
			{
			System.out.print(data.getKey());
			
			}
		}
		
	}
}