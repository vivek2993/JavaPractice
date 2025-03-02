package com.comparator.comparable;

import java.util.Comparator;

/**
 * This is the example of comparator In this we create a class for the parameter
 * on the basis of which we have to do the sorting , so that it does not change
 * the original class
 */
public class NameComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		/**
		 * as here we are comparing on the basis of string that why we have used
		 * compareTo method otherwise we can use o1.getId-o2.getId
		 */
		return o1.getName().compareToIgnoreCase(o2.getName());

	}

}
