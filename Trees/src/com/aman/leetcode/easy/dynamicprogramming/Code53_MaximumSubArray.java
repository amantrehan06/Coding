package com.aman.leetcode.easy.dynamicprogramming;

import com.aman.arrays.GlobalArrays;

public class Code53_MaximumSubArray {

	public int maxSubArray(int[] arr) {

		int dp[] = new int[arr.length];

		dp[0] = arr[0];
		int min = 0;
		int max = 0;

		int maxSum = arr[0];
		for (int i = 1; i < arr.length; i++) {
			dp[i] = Math.max(dp[i - 1] + arr[i], arr[i]);
			if (dp[i] > maxSum) {
				maxSum = dp[i];
			}
			
			if (dp[i] > dp[i - 1] && dp[i - 1] < 0) {
				min = i;
				max = i;
			} else if (dp[i] > dp[max]) {
				max = i;
			}
		}

		GlobalArrays.print(dp);
		System.out.println("Min Index " + min);
		System.out.println("Max Index " + max);

		return maxSum;
	}

	public static void main(String args[]) {

		int arr[] = new int[] { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		int result = new Code53_MaximumSubArray().maxSubArray(arr);

		System.out.println(result);

	}

}
