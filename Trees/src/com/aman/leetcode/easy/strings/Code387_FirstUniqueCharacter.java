package com.aman.leetcode.easy.strings;

import java.util.HashMap;
import java.util.Map;

public class Code387_FirstUniqueCharacter {

	public int firstUniqChar(String str) {

		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (map.containsKey(ch)) {
				int occurance = map.get(ch);
				occurance += 1;
				map.put(ch, occurance);
			} else {
				map.put(ch, 1);
			}
		}

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			int occurance = map.get(ch);
			if (occurance == 1) {
				return i;
			}
		}
		return -1;

	}

	public static void main(String args[]) {

		String input = "loveleetcode";
		System.out.println(new Code387_FirstUniqueCharacter().firstUniqChar(input));
	}
}
