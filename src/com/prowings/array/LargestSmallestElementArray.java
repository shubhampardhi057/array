package com.prowings.array;

public class LargestSmallestElementArray {
	
	public static void main(String[] args) {
		
		int [] a = {25,30,50,75,100};
		
		int max = a[0];
		int min = a[0];
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i] < min)
			{
//			    max = a[i];
			   
			    min = a[i];
			}
		}
//		System.out.println(max);
		
		
		System.out.println(min);
	}

}
