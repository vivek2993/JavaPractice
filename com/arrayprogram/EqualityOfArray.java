//Write a java program to check the equality of two arrays?
//First Method : Using Iterative Method
package com.arrayprogram;

import java.util.Arrays;

public class EqualityOfArray {

	public static void main(String[] args) {
		int[] s1 = { 21, 57, 11, 37, 24 };
		int[] s2 = { 21, 57, 11, 37, 24 };
		
		System.out.println(Arrays.equals(s1, s2));
	}
	
//    public static void main(String[] args)
//    {    
//        int[] s1 = {21, 57, 11, 37, 24};
//         int[] s2 = {21, 57, 11, 37, 24};
//		 
//        boolean b = true;
//         
//        if(s1.length == s2.length)
//        {
//            for (int i = 0; i < s1.length; i++)
//            {
//                if(s1[i] != s2[i])
//                {
//                    b = false;
//                }
//            }
//        }
//        else
//        {
//            b = false;
//        }
//         
//        System.out.println("Input Arrays :");
//        System.out.println("First Array : "+Arrays.toString(s1));
//        System.out.println("Second Array : "+Arrays.toString(s2));
//        
//        if (b)
//        {
//            System.out.println("Two Arrays Are Equal");
//        }
//        else
//        {
//            System.out.println("Two Arrays Are Not equal");
//        }
//    }
}