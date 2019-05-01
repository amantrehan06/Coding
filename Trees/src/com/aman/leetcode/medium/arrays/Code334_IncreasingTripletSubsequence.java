package com.aman.leetcode.medium.arrays;

public class Code334_IncreasingTripletSubsequence {

	public boolean increasingTriplet(int[] arr) {

		int min = Integer.MAX_VALUE, secondMin = Integer.MAX_VALUE;
		
		for (int num : arr) {
			if (num <= min)
				min = num;
			else if (num < secondMin)
				secondMin = num;
			else if (num > secondMin)
				return true;
		}
		return false;
	}

	public static void main(String args[]) {

		boolean result = new Code334_IncreasingTripletSubsequence().increasingTriplet(new int[] { 4, 5, 1,2,3});

		System.out.println(result);
	}
}
