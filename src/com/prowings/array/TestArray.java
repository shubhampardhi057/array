package com.prowings.array;

public class TestArray {
	
	public static void main(String[] args) {
		
		String s = "hello";
		
		System.out.println(s.getClass().getName());
		
		Integer i = 10;
		
		System.out.println(i.getClass().getName());
		
		
		int [] numbers = {10,20,30,40,50,60};
		long [] numbers1 = {10,20,30,40,50,60};
		float [] numbers2 = {10,20,30,40,50,60};
		double [] numbers3 = {10,20,30,40,50,60};
		
		Integer [] numbers4 = {10,20,30,40,50,60};
		String [] numbers5 = {"hello","hii"};
		
		System.out.println(numbers.getClass().getName());
		System.out.println(numbers1.getClass().getName());
		System.out.println(numbers2.getClass().getName());
		System.out.println(numbers3.getClass().getName());
		
		System.out.println(numbers4.getClass().getName());
		System.out.println(numbers5.getClass().getName());
		
		
		
		
		
		
	}

}
