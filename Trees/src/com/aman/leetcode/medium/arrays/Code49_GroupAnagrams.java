package com.aman.leetcode.medium.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Code49_GroupAnagrams {

	public List<List<String>> groupAnagrams(String[] strs) {

		List<List<String>> resultList = new ArrayList<List<String>>();

		if (strs == null || strs.length == 0) {
			return resultList;
		}

		Map<String, List<String>> map = new HashMap<>();

		int index = -1;
		for (String str : strs) {
			++index;
			char[] wordArr = str.toCharArray();
			Arrays.sort(wordArr);
			
			String word = String.copyValueOf(wordArr);
			if (map.containsKey(word)) {
				List<String> list = map.get(word);
				list.add(str);
			} else {
				List<String> list = new ArrayList<>();
				list.add(str);

				map.put(word, list);
			}
		}

        return new ArrayList(map.values());
	}

	public static void main(String args[]) {
		// List<List<Integer>> result = new Code15_3Sum().threeSum(new int[] { -1, 0, 1,
		// 2, -1, -4 });

		List<List<String>> result = new Code49_GroupAnagrams()
				.groupAnagrams(new String[] { "eat", "tea", "tan", "ate", "nat", "bat" });

		System.out.println(result);
	}
}
