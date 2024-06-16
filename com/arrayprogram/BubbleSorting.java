package com.arrayprogram;

class BubbleSorting {
	public static void main(String s[]) {
		int[] a = { 30, 10, 20, 50 };

		for (int i = 0; i < a.length; i++) // this is for round
		{
			// int flag=0;
			for (int j = 0; j < a.length - 1 - i; j++) {
				if (a[j] > a[j + 1]) {
					int temp;
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
				/*
				 * if(flag==0) { break; }
				 */
			}
		
		}
		for(int num:a) {
			System.out.println(num);
		}
	}
}