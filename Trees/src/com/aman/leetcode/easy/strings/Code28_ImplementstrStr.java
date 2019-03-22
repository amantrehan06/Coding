package com.aman.leetcode.easy.strings;

public class Code28_ImplementstrStr {

	public int strStr(String haystack, String needle) {

		if (needle == null || needle.length() == 0) {
			return 0;
		}

		int i = 0;

		while (i < haystack.length()) {
			int j = 0;
			while (i < haystack.length() && haystack.charAt(i) != needle.charAt(j)) {
				++i;
			}

			while (j < needle.length() && ((i + j) < haystack.length()) && haystack.charAt(i + j) == needle.charAt(j)) {
				++j;
			}

			if (j == needle.length()) {
				return i;
			} else {
				i++;
			}

		}

		return -1;
	}

	public static void main(String args[]) {

		System.out.println(new Code28_ImplementstrStr().strStr("aaaaa", "bba"));
	}
}
