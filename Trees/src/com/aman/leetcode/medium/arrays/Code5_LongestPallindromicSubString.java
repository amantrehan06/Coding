package com.aman.leetcode.medium.arrays;

public class Code5_LongestPallindromicSubString {

	public String longestPalindrome(String str) {
		String result = "";

		if (str == null || str.length() == 0) {
			return "";
		} else if (str.length() == 1) {
			return str;
		}

		int length = str.length();

		boolean arr[][] = new boolean[length][length];

		int k = 0;
		while (k < length) {
			arr[k][k] = true;
			result = String.valueOf(str.charAt(k));
			++k;

		}

		k = 0;

		while (k + 1 < length) {
			if (str.charAt(k) == str.charAt(k + 1)) {
				arr[k][k + 1] = true;
				if (result.length() < str.substring(k, k + 1 + 1).length()) {
					result = str.substring(k, k + 1 + 1);
				}

			} else {
				arr[k][k + 1] = false;
			}
			++k;
		}

		int i = 0;

		int counter = 2;

		while (i + counter < length) {

			int j = i + counter;
			while (i + counter < length) {

				if (arr[i + 1][j - 1] == true && (str.charAt(i) == str.charAt(j))) {
					arr[i][j] = true;

					if (result.length() < str.substring(i, j + 1).length()) {
						result = str.substring(i, j + 1);
					}
				} else {
					arr[i][j] = false;
				}
				++i;
				++j;

			}
			++counter;
			i = 0;
		}

		return result;
	}

	public static void main(String args[]) {

		String result = new Code5_LongestPallindromicSubString().longestPalindrome("abaa");

		System.out.println(result);

	}
}
