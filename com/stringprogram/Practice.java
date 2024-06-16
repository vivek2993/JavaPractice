package com.stringprogram;

import java.util.ArrayList;
import java.util.Collections;

public class Practice implements Comparable<Practice>
{
	
	int id;
	String name;

	
	
	public Practice(int id, String name) {
		this.id = id;
		this.name = name;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	@Override
	public int compareTo(Practice o) {
		
		if(o.getId() >this.id) {
			return -1;
		}else if(o.getId() <this.id)
			return 1;
		else
			return 0;
	}
	
	
public static void main(String[] args) {
		
	
		ArrayList<Practice> al = new ArrayList<>();
		
		al.add( new Practice(2, "Vivek"));
		al.add( new Practice(1, "Kumar"));
		
		Collections.sort(al);
		
		al.forEach(s -> System.out.println(s.id+" "+s.name));
		
	}
	
      	
}

