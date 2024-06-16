//ArrayList To Array :
package com.arrayprogram;

import java.util.ArrayList;
 
public class ArrayListtoArray 
{      
    public static void main(String[] args) 
    {    
        ArrayList<String> list = new ArrayList<>();
          
        list.add("JAVA");
        list.add("JSP");
        list.add("ANDROID");
        list.add("STRUTS");
        list.add("HADOOP");
        list.add("JSF");
           System.out.println(list.size());
		   
        String[] array = new String[list.size()]; 
          
        list.toArray(array);
          
        for (String string : array)
        {
            System.out.println(string);
        }
    }    
}