package com.aman.leetcode.medium.backtracking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Code17_PhoneNumberCombination {

	public List<String> letterCombinations(String digits) {

		List<String> result = new ArrayList<>();

		if (digits == null || digits.length() == 0) {
			return result;
		}

		Map<Integer, String> map = new HashMap<>();
		map.put(0, "");
		map.put(1, "");
		map.put(2, "abc");
		map.put(3, "def");
		map.put(4, "dhi");
		map.put(5, "jkl");
		map.put(6, "mno");
		map.put(7, "pqrs");
		map.put(8, "tuv");

		map.put(9, "wxyz");

		letterCombinationsRecursuive(result, digits, 0, map, "");

		return result;

	}

	public void letterCombinationsRecursuive(List<String> result, String digits, int index, Map<Integer, String> map,
			String str) {

		if (digits.length() == str.length()) {
			result.add(str);
			return;
		}

		char digit = digits.charAt(index);
		String letter = map.get(Integer.parseInt(String.valueOf(digit)));

		for (int i = 0; i < letter.length(); i++) {

			letterCombinationsRecursuive(result, digits, index + 1, map, str + letter.charAt(i));

		}

	}

	public static void main(String args[]) {

		String input = "23";

		List<String> result = new Code17_PhoneNumberCombination().letterCombinations(input);

		System.out.println(result);

	}

}
