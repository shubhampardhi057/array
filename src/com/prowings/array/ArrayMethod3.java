package com.prowings.array;

import java.util.Arrays;

public class ArrayMethod3 {
	
	public static void main(String[] args) {
		
		int [] a = {10,2,5,7};
		
		System.out.println(">>>>>>>>>>:---:" + Arrays.binarySearch(a, 2));
		
		int [] sortedArray = sortArray(a);
		
		System.out.println(Arrays.toString(sortedArray));
		
	}
	
	private static int[] sortArray(int [] a) {
		
		int temp =0;
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i] >a[j])
				{
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
	
		return a;
	}
}
