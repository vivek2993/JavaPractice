package com.stringprogram;
import java.util.*;
class MaxRepeatChar
{
	public static void main(String[] arg)
	{
		String s="hi brooovv h";
		char[] x=s.toCharArray();
		
			Map<Character,Integer> map=new LinkedHashMap<Character,Integer> ();
		
		int i=0;
		while(i!=x.length)
		{
			if(map.containsKey(x[i]) == false)
			{
				map.put(x[i],1);
			}
			else
			{
				int oldvalue=map.get(x[i]);
				int newv=oldvalue+1;
				map.put(x[i],newv);
			}
			i++;
		}
		char maxkey=' ';
		int maxval=0;
		for(Map.Entry<Character,Integer> data:map.entrySet())
		{
			if(data.getValue()>maxval)
			{
				maxval=data.getValue();
				maxkey=data.getKey();
				
			}
		}
		System.out.println(maxkey);
		System.out.println(maxval);
	}
}
