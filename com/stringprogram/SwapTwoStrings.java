//Swap Two String Variables Without Using Third Variable :
package com.stringprogram;

import java.util.Scanner;
 
public class SwapTwoStrings 
{  
    public static void main(String[] args) 
    {   
        Scanner sc = new Scanner(System.in);
		
        System.out.println("Enter First String :");
        String s1 = sc.next();
		
        System.out.println("Enter Second String :");
        String s2 = sc.next();
		
        System.out.println("Before Swapping :");
         
        System.out.println("s1 : "+s1);
         
        System.out.println("s2 : "+s2);
         
        //Swapping starts
         
        s1 = s1 + s2;
         
        s2 = s1.substring(0, s1.length()-s2.length());
         
        s1 = s1.substring(s2.length());
         
        //Swapping ends
         
        System.out.println("After Swapping :");
         
        System.out.println("s1 : "+s1);
         
        System.out.println("s2 : "+s2);
    }   
}
/*Output :

Enter First String :
JAVA
Enter Second String :
J2EE
Before Swapping :
s1 : JAVA
s2 : J2EE
After Swapping :
s1 : J2EE
s2 : JAVA

How It Works?

Let s1 = â€œJAVAâ€? and s2 = â€œJ2EEâ€?

//Swapping starts

s1 = s1 + s2

â€“> s1 = â€œJAVAâ€? + â€œJ2EEâ€?


â€“> s1 = â€œJAVAJ2EEâ€?

s2 = s1.substring(0, s1.length()-s2.length())

â€“> s2 = s1.substring(0, 8-4)

â€“> s2 = s1.substring(0, 4) //This copies first 4 chars of s1 to s2

â€“> s2 = â€œJAVAâ€?

s1 = s1.substring(s2.length())

â€“> s1 = s1.substring(4) //This copies chars starting from index 4 to end of s1 to s1 itself

â€“> s1 = â€œJ2EEâ€?

//Swapping ends

After swapping, s1 = â€œJ2EEâ€? and s2 = â€œJAVAâ€?*/