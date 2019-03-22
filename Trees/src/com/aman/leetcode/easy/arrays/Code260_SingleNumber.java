package com.aman.leetcode.easy.arrays;

public class Code260_SingleNumber {

	public int singleNumber(int[] nums) {

		int result = nums[0];
		for (int i = 1; i < nums.length; i++) {
			result = result ^ nums[i];
		}

		return result;
	}

	public static void main(String args[]) {
		System.out.println(new Code260_SingleNumber().singleNumber(new int[] { 1, 2, 5, 2, 1, 3 }));
	}
}
