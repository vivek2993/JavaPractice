//Write a java program to convert an array to ArrayList 
//Array To ArrayList :
package com.arrayprogram;

import java.util.ArrayList;
import java.util.Arrays;
  
public class ArraytoArrayList 
{      
    public static void main(String[] args) 
    {    
        String[] array = {"ANDROID", "JSP", "JAVA", "STRUTS", "HADOOP", "JSF"};
          
        ArrayList<String> list = new ArrayList<>(Arrays.asList(array));
          
        System.out.println(list);

    }    
}
