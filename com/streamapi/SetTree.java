package com.streamapi;

import java.util.Iterator;
import java.util.TreeSet;

public class SetTree {

	 public static void main(String args[]){  
		  //Creating and adding elements  
		  TreeSet<String> al=new TreeSet<>();  
		  al.add("Ravi");  
		  al.add("Vijay");  
		  al.add("Ravi");  
		  al.add("Ajay");  
		  //Traversing elements  
		  Iterator<String> itr=al.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
		  } 
}
}
