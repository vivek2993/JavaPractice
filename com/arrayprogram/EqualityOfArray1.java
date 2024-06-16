//Second Method : Using Arrays.equals() Method
package com.arrayprogram;

import java.util.Arrays;

public class EqualityOfArray1
{
    public static void main(String[] args)
    {    
        int[] s1 = {21, 57, 11, 37, 24};
         
        int[] s2 = {21, 57, 11, 37, 24};
         
        boolean b = Arrays.equals(s1, s2);
         
        System.out.println("Input Arrays :");
        
        System.out.println("First Array : "+Arrays.toString(s1));
        
        System.out.println("Second Array : "+Arrays.toString(s2));
        
        if (b)
        {
            System.out.println("Two Arrays Are Equal");
        }
        else
        {
            System.out.println("Two Arrays Are Not equal");
        }
    }
}