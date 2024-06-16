package com.stringprogram;

import java.util.*;
class FirstNonRepeatingChar
{
	public static void main(String arg[])
	{
		Scanner s=new Scanner(System.in);
		String s1=s.nextLine();
		char[] c=s1.toCharArray();
		
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
			if(data.getValue()==1)
			{
			System.out.println(data.getKey());
			System.exit(0);
			}
		}
		
	}
}