package com.prowings.array;

import java.util.Arrays;

public class AddElementsArray {
	
	public static void main(String[] args) {
		
		
		int [] number1 = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		
		int index = 2;
		
		int add = 40;
		
		System.out.println("Before Adding Element :--  "+ Arrays.toString(number1));
		
		for(int i=number1.length-1;i>index;i--)
		{
			
			number1[i] = number1[i-1];
		}
		
		number1[index] = add;
		
		System.out.println("After Adding Element :--  "+ Arrays.toString(number1));

	}

}
