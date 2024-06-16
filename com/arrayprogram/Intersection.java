//Write a java program to find the Common element of two arrays?
package com.arrayprogram;

import java.util.Arrays;
import java.util.HashSet;

class Intersection
{
	
	public static void main(String[] args) {
		
		int[] number= {7,9,8,9,5,2,5};
		int[] number2= {7,9,1,0};

		HashSet<Integer> first=new HashSet<>();
		HashSet<Integer> intersection=new HashSet<>();

		for(int num:number) {
			
			first.add(num);
		}
		
		for(int num2:number2) {
			
			if(first.contains(num2))
				intersection.add(num2);
		}
		
		System.out.println(intersection);
		 
		}
	
	
//    public static void main(String[] args)
//    {
//        String[] s1 = {"ONE", "TWO", "THREE", "FOUR", "FIVE"};
//        String[] s2 = {"THREE", "FOUR", "FIVE", "SIX", "SEVEN"};
// 
//        HashSet<String> set = new HashSet<>();
// 
//        for (int i = 0; i < s1.length; i++)
//        {
//            for (int j = 0; j < s2.length; j++)
//            {
//                if(s1[i].equals(s2[j]))
//                {
//                    set.add(s1[i]);
//                }
//            }
//        }
// 
//        System.out.println("First Array : "+Arrays.toString(s1));
//        System.out.println("Second Array : "+Arrays.toString(s2));
//        
//        System.out.println("Common Elements : "+set);     
//    }
}