package com.prowings.array;

import java.util.Arrays;

public class ArrayBasics2 {
	
	public static void main(String[] args) {
		
		int [] numbers = {1,2,3,4,5,6,7,8,9,10};
		
		String[] words = {"hello","hii"};
		
		char [] characters = {'a','e','i','o','u'};
		
		for(int i=0;i<numbers.length;i++)
		{
			System.out.println(numbers[i]);
		}
		
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		
		for(int i=0;i<words.length;i++)
		{
			System.out.println(words[i]);
		}
		
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		
		for(int i=0;i<characters.length;i++)
		{
			System.out.println(characters[i]);
		}
		
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		
		
		System.out.println(Arrays.toString(characters));
		System.out.println(Arrays.toString(words));
		System.out.println(Arrays.toString(numbers));
	}

}
