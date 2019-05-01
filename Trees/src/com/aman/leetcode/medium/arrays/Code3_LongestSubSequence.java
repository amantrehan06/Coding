package com.aman.leetcode.medium.arrays;

import java.util.HashMap;
import java.util.Map;

public class Code3_LongestSubSequence {

	public int lengthOfLongestSubstring(String str) {

		int maxSize = 0;

		if (str == null || str.length() == 0) {
			return maxSize;
		}

		int i = 0;
		int j = 0;
		
		while (i < str.length() && j < str.length()) {
			Map<Character, Integer> map = new HashMap<>();

			int size = 0;
			j = i;

			while (j < str.length()) {
				if (map.containsKey(str.charAt(j))) {
					i = map.get(str.charAt(j)) + 1;
					break;
				} else {
					map.put(str.charAt(j), j);
					++size;
					++j;
				}
			}

			if (size > maxSize) {
				maxSize = size;
			}

		}
		return maxSize;
	}

	public static void main(String args[]) {

		int result = new Code3_LongestSubSequence().lengthOfLongestSubstring("dvdf");

		System.out.println(result);

	}
}
