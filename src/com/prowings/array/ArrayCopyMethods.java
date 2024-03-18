package com.prowings.array;

import java.util.Arrays;

public class ArrayCopyMethods {
	
	public static void main(String[] args) {
		
		
		int [] number1 = {10,20,30,40,50};
		
//		int [] number2 = number1;
		
//		int [] number2 = Arrays.copyOf(number1, number1.length);
		
//		int [] number2 = new int [number1.length];
		
//		System.arraycopy(number1, 0, number2, 0, number1.length);
		
		
		int [] number2 = copyGivenArray(number1);
		
	
		System.out.println(Arrays.toString(number2));
		
		
		System.out.println(number1 == number2 );
	}
	
	public static int[] copyGivenArray(int [] input) {
		
		int [] inputCopy = new int[input.length];
		
		for(int i=0;i<input.length;i++)
		{
			inputCopy[i] = input[i];
		}
		
		return inputCopy;
	}

}
