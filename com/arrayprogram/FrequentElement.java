package com.arrayprogram;
import java.util.*;

class FrequentElement
{
	public static void main(String[] arg)
	{
		int[] x={1,2,3,1,5,6,4,5,1,1,8,1,8,9};
		
		Map<Integer,Integer> map=new LinkedHashMap<> ();
		
		for(int i=0;i<x.length;i++)
		{
			if(map.containsKey(x[i]))
				map.put(x[i],map.get(x[i])+1);
			else
				map.put(x[i],1);
		}
		int maxkey=0;
		int maxval=0;
		for( Map.Entry<Integer,Integer> data:map.entrySet())
		{
			if(data.getValue()> maxval ) 
			{
				maxval=data.getValue();
				maxkey=data.getKey();
			}
		}
		System.out.println("most frequent element- "+maxkey);
		System.out.println("no. of times- "+maxval);
	}
}
