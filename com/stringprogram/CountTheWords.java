//Write a java program to count the number of words in a string?
package com.stringprogram;

import java.util.*;
 
//One more method to count the number of words in a string.
 
class CountTheWords
{
    public static void main(String[] args)
    {
        System.out.println("Enter the string");
 
        Scanner sc = new Scanner(System.in);
 
        String s=sc.nextLine();
 
        String trim = s.trim();
 
//        \\s+ this will consider the double space also
        String[] split = trim.split("\\s+");
        System.out.println("Number of words in a string = "+split.length);
    }
} 