package com.prowings.array;

import java.util.Arrays;

public class CopyArray {

	public static void main(String[] args) {
		
		
		int [] number1 = {20,30,10,40,50,70,90,10,80,60};
		
		int [] number2 = new int [10];
		
		
		
		System.out.println("number2 before :-"+ Arrays.toString(number2));
		

		for(int i=0;i<number1.length;i++)
		{
			number2[i] = number1[i];
		}
		
		System.out.println("number2 after :-" + Arrays.toString(number2));
		
		
		
	}
}
