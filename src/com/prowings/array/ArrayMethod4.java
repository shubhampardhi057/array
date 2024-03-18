package com.prowings.array;

import java.util.Arrays;

public class ArrayMethod4 {
	
	public static void main(String[] args) {
		
		int [] a = {10,20,30,40,50,60,70,80,90,100};
		
		int [] b = Arrays.copyOfRange(a, 0, 10);
		
		
		System.out.println(Arrays.toString(b));
		
		System.out.println(a == b);
		
		
	}
	

}
