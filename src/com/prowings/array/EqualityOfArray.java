package com.prowings.array;

public class EqualityOfArray {
	
	public static void main(String[] args) {
		
		int [] number1 = {10,20,30,40,50};
		int [] number2 = {10,30,20,40,50};
		int [] number3 = {10,20,30,40,50};
		
		
		checkEquality(number1,number2);
		checkEquality(number1,number3);
		
	}
	
	public static void checkEquality(int [] number1,int [] number2) {
		
		boolean equalornot = true;
		
		if(number1.length == number2.length)
		{
			for(int i=0;i<number1.length;i++)
			{
				if(number1[i] != number2[i])
				{
					equalornot = false;
				}
			}
		}
		else
		{
			equalornot = false;
		}
		
		if( equalornot )
		{
			System.out.println("Two Arrays are Equal");
		}
		else
		{
			System.out.println("Two Arrays are Not Equal");
		}
	}

}
