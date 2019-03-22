package com.aman.leetcode.easy.strings;

public class Code14_longestCommonPrefix {

	/*
	 * public String longestCommonPrefix(String[] arr) {
	 * 
	 * if(arr == null || arr.length == 0) { return ""; } StringBuilder sb = new
	 * StringBuilder();
	 * 
	 * int index = 0;
	 * 
	 * int x = 0; while (x < arr[0].length()) {
	 * 
	 * char character = arr[0].charAt(index);
	 * 
	 * boolean shouldTerminate = false; for (int i = 1; i < arr.length; i++) {
	 * 
	 * if (index >= arr[i].length()) { shouldTerminate = true; break; }
	 * 
	 * if (character != arr[i].charAt(index)) { shouldTerminate = true; break; } }
	 * 
	 * if (shouldTerminate) { break; }
	 * 
	 * sb.append(character); ++index; ++x; }
	 * 
	 * if (index == 0) { return ""; } else { return sb.toString();
	 * 
	 * } }
	 */

	public static void main(String args[]) {

		System.out
				.println(new Code14_longestCommonPrefix().longestCommonPrefix(new String[] { "fll", "fl", "flight" }));
	}

	public String longestCommonPrefix(String[] arr) {

		if (arr == null || arr.length == 0) {
			return "";
		}

		String result = longestCommonPrefix(arr, 0, arr.length - 1);

		return result;
	}

	public String longestCommonPrefix(String[] arr, int low, int high) {

		if (low == high) {
			return arr[low];
		} else {

			int mid = (low + high) / 2;

			String str1 = longestCommonPrefix(arr, low, mid);
			String str2 = longestCommonPrefix(arr, mid + 1, high);

			return commonPriviledgeUtil(str1, str2);

		}

	}

	public String commonPriviledgeUtil(String str1, String str2) {

		int length1 = str1.length();
		int length2 = str2.length();
		int n = length1;

		if (length1 > length2) {
			n = length2;
		}

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < n; i++) {
			if (str1.charAt(i) != str2.charAt(i)) {
				break;
			}
			sb.append(str1.charAt(i));
		}
		return sb.toString();

	}
}
