package com.aman.leetcode.easy.others;

public class Code268_MissingNumber {

	public int missingNumber(int[] arr) {

		if (arr.length == 0) {
			return 0;
		}
		
		int actualSum = 0;
		for (int i = 1; i <= arr.length; i++) {
			actualSum = actualSum + i;
		}

		int currentSum = 0;
		for (int i = 0; i < arr.length; i++) {
			currentSum = currentSum + arr[i];
		}

		return actualSum - currentSum;
	}

	public static void main(String args[]) {

		int result = new Code268_MissingNumber().missingNumber(new int[] { 3, 0, 1 });

		System.out.println(result);
	}
}
