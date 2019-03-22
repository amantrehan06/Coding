package com.aman.leetcode.easy.arrays;

public class Code66_PlusOne {

	public int[] plusOne(int[] arr) {

		int remainder = 1;

		for (int i = arr.length - 1; i >= 0; i--) {
			int rem = (remainder + arr[i]) / 10;
			int div = (remainder + arr[i]) % 10;
			arr[i] = div;
			remainder = rem;
		}
		if (remainder == 0) {
			return arr;
		}

		int [] result = new int[arr.length+1]; 
		result[0] = remainder;
		
		if (remainder != 0) {
			for (int i = 1; i < result.length; i++) {
				result[i] = arr[i-1];
			}
		}
		
		return result;

	}

	public static void main(String args[]) {
		System.out.println(new Code66_PlusOne().plusOne(new int[] { 9, 9 }));
	}
}
