package com.prowings.array;

import java.util.Arrays;

public class ArrayMethod {
	
	public static void main(String[] args) {
		
		int [] numbers = {20,50,70,100,10,30};
		
		
		Arrays.sort(numbers);
		
		
		System.out.println("Sorted Array is :-" +Arrays.toString(numbers));
		
		
		
		char [] chars1 = {'a','b','d','c','f','e'};
		
		
		System.out.println(Arrays.binarySearch(chars1, 0, 5, 'b'));
		
		
		
		
		

		
		
		
		
	}

}
