// Write a java program to find the duplicate words and their number of occurrences in a string?
package com.stringprogram;

import java.util.*;
public class RemoveDuplicate
{
    public static void main(String[] args)
    {
       String s="hihelloo";
	   char[] x=s.toCharArray();
	   Map<Character,Integer> map=new LinkedHashMap<Character,Integer>();
	   
	   int i=0;
	while(i!=x.length)
		{
			if(map.containsKey(x[i])== false)
			{
				map.put(x[i],1);
			}else
			{
				int ol=map.get(x[i]);
				int ne=ol+1;
				map.put(x[i],ne);
			}
			i++;
	   }

	   String res=" ";
	   for(Map.Entry<Character,Integer> data : map.entrySet())
	   {
		
		     res=res+data.getKey();
	   }
	   
			   System.out.print(res);
    }
}