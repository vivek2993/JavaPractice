//separate zeros from non-zeros in an integer array?
//Moving Zeros To End Of An Array :
package com.arrayprogram;

import java.util.Arrays;

public class SeparateZeros
{
    static void moveZerosToEnd(int a[])
    {
    	System.out.println("Input Array : "+Arrays.toString(a));
    	
        //Initializing counter to 0
 
        int counter = 0;
 
        //Traversing a from left to right
 
        for (int i = 0; i < a.length; i++)
        {
            //If a[i] is non-zero
 
            if(a[i] != 0)
            {
                //Assigning a[i] to a[counter]
 
                a[counter] = a[i];
 
                //Incrementing the counter by 1
 
                counter++;
            }
        }
 
        //Assigning zero to remaining elements
 
        while (counter < a.length)
        {
            a[counter] = 0;
 
            counter++;
        }
 
        System.out.println("Input Array After moving zeros to end :");
        
        System.out.println(Arrays.toString(a));
        
        System.out.println("======================================");
    }
 
    public static void main(String[] args)
    {
        moveZerosToEnd(new int[] {12, 0, 7, 0, 8, 0, 3});
 
        moveZerosToEnd(new int[] {1, -5, 0, 0, 8, 0, 1});
 
        moveZerosToEnd(new int[] {0, 1, 0, 1, -5, 0, 4});
 
        moveZerosToEnd(new int[] {-4, 1, 0, 0, 2, 21, 4});
    }
}