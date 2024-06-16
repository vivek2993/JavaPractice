package com.arrayprogram;
import java.util.*;
class V
{
	public static void main(String[] arg)
	{
		int[] a={1,2,8,1,5};
		
		Map<Integer,Integer> hs=new LinkedHashMap<Integer,Integer>();
		
		for(int i:a)
		{
			if(hs.containsKey(i))
			{
				hs.put(i,hs.get(i)+1);
			}
			else
				hs.put(i,1);
		}
		int maxkey=0;
		int maxval=0;
		
		for(Map.Entry<Integer,Integer> data:hs.entrySet())
		{
			if(maxval<data.getValue())
			{
				maxval=data.getValue();
				maxkey=data.getKey();
			}
		}
		System.out.println(maxkey);
		System.out.println(maxval);
	}
}