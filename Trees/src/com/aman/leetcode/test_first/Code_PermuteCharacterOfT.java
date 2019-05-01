package com.aman.leetcode.test_first;

import java.util.HashMap;

public class Code_PermuteCharacterOfT {

	public String customSortString(String S, String T) {

		char[] result = new char[T.length()];

		if (T == "") {
			return "";
		}

		HashMap<Character, Integer> map = new HashMap<>();

		for (int i = 0; i < S.length(); i++) {
			map.put(S.charAt(i), i);
		}

		int j = T.length() - 1;
		for (int i = 0; i < T.length(); i++) {

			if (map.containsKey(T.charAt(i))) {
				int index = map.get(T.charAt(i));

				if (result[index] != '\0') {

					Character toBePut = T.charAt(i);

					while (index+1 < result.length && toBePut != '\0' ) {

						Character temp = Character.valueOf(result[index + 1]);
						result[index + 1] = toBePut;

						toBePut = temp;

						++index;
					}

				} else {
					result[index] = T.charAt(i);
				}

			} else {
				result[j] = T.charAt(i);
				--j;
			}

		}

		return String.valueOf(result);
	}

	public static void main(String args[]) {

		String result = new Code_PermuteCharacterOfT().customSortString("exv", "xwvee");

		System.out.println(result);
	}
}
