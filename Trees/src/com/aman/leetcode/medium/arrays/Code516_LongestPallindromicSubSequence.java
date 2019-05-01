package com.aman.leetcode.medium.arrays;

public class Code516_LongestPallindromicSubSequence {

	public int longestPalindromeSubseq(String str) {

		int arr[][] = new int[str.length()][str.length()];

		int x = 0;
		while (x < str.length()) {
			arr[x][x] = 1;
			++x;
		}

		for (int length = 1; length < str.length(); length++) {

			int i = 0;
			int j = i + length;
			
			while (j < str.length()) {

				if (str.charAt(i) == str.charAt(j)) {
					arr[i][j] = 2 + (arr[i + 1][j - 1]);
				} else {
					arr[i][j] = Math.max(arr[i][j-1], arr[i+1][j]);
				}

				++i;
				j = i + length;
			}

		}
		

		return arr[0][str.length() - 1];
	}

	public static void main(String args[]) {

		int result = new Code516_LongestPallindromicSubSequence().longestPalindromeSubseq("agbdba");

		System.out.println(result);

	}
}
