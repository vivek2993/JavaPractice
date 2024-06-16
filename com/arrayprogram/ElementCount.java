//Write a java program to count occurrences of each element in an array?
package com.arrayprogram;

import java.util.HashMap;
  
public class ElementCount 
{  
   
	public static void main(String[] args) 
    {  
		int[]a={12, 9, 12, 9, 10, 9, 10, 11};
		
		HashMap<Integer,Integer> map=new HashMap<>();
		
		for(int i:a)
		{
			if(map.containsKey(i))
			{
				map.put(i,map.get(i)+1);
			}
			else
			{
				map.put(i,1);
			}
		}
		System.out.println("Element count"+map);
		
	}}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		