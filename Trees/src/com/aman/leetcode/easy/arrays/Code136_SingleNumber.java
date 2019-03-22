package com.aman.leetcode.easy.arrays;

public class Code136_SingleNumber {

	public int[] singleNumber(int[] nums) {

		int result = nums[0];

		int x = 0;
		int y = 0;
		for (int i = 1; i < nums.length; i++) {
			result = result ^ nums[i];
		}

		int rightMostSetBit = result & ~(result - 1);

		for (int i = 0; i < nums.length; i++) {
			if ((nums[i] & rightMostSetBit) != 0) {
				x= x^nums[i];
			}else {
				y = y^nums[i];
			}
		}
		return new int[] { x, y };
	}

	public static void main(String args[]) {
		System.out.println(new Code136_SingleNumber().singleNumber(new int[] { 5, 3, 1, 3, 5, 7 }));
	}
}
