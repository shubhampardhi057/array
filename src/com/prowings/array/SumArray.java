package com.prowings.array;

public class SumArray {
	
	public static void main(String[] args) {
		
		int [] number = {1,2,3,4,5,6,7,8,9,10};
		
		int sum =0;
		
		for(int n: number)
		{
			sum += n ;
		}
		
		System.out.println("Sum := " +sum);
		
		

	}
}
