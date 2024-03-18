package com.prowings.array;

import java.util.Arrays;

public class ArrayMethod2 {

	
	public static void main(String[] args) {
		
		int [] num = {10,2,5,1};
		
		
		int [] copyNumber =  Arrays.copyOf(num,num.length);
				
				
	    System.out.println(Arrays.toString(copyNumber));
	    
	    System.out.println(num == copyNumber);
				
				
	}
}

