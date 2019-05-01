package com.aman.leetcode.test_first;

public class Code_BuySellStock {

	public int[] productExceptSelf(int[] arr) {

		int result[] = new int[arr.length];

		
		int product = 1;
		for(int i=0 ; i<arr.length ; i++) {	
			result [i] = product;
			product = product * arr[i];
			
		}
		
		product = 1;
		for(int i=arr.length-1; i>= 0; i--) {	
			result [i] = result[i] * product;
			product = product * arr[i];
			
		}
		
		
		
		return result;
	}

	public static void main(String args[]) {

		int[] result = new Code_BuySellStock().productExceptSelf(new int[] { 2, 3, 4, 5 });

		System.out.println(result);
	}
}
