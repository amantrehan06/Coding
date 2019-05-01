package com.aman.leetcode.easy.dynamicprogramming;

import com.aman.arrays.GlobalArrays;

public class Code198_HouseRobber {

	public int rob(int[] arr) {

		if(arr.length == 0) {
			return 0;
		}
		int dp[] = new int[arr.length+1];
		
		dp[1] = arr[0];
		
		for(int i=2 ; i< dp.length; i++) {
			
			dp[i] = Math.max(dp[i-1], dp[i-2]+arr[i-1]);
			
		}
		
		//GlobalArrays.print(dp);
		
		return dp[dp.length-1];
	}

	public static void main(String args[]) {
		
		System.out.println(new Code198_HouseRobber().rob(new int[] { 1, 2, 3, 1}));
	}
}
