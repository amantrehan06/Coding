package com.aman.arrays.rotations;

import java.util.LinkedList;
import java.util.List;

/**
 * https://www.geeksforgeeks.org/given-a-string-print-all-possible-palindromic-partition/
 * @author ihsgah
 *
 */
public class FindAllPallindrome {

	public static void main(String args[]) {
		String str = "nitin";
		System.out.println("Input string: " + str);
		printAll(str);
	}

	private static void printAll(String str) {
		int split = 1;
		List<String> set = new LinkedList<>();
		set.add(str);
		while (split <= str.length()) {
			for (int i = 0; i < str.length() - split + 1; i++) {
				String strToValidate = str.substring(i, i + split);
				if (checkPallindrome(strToValidate)) {
					System.out.print(strToValidate + " ");
				}
			}
			System.out.println();
			++split;
		}
	}

	private static boolean checkPallindrome(String str) {
		int l = 0;
		int r = str.length() - 1;
		while (l <= r) {
			if (str.charAt(l) != str.charAt(r)) {
				return false;
			}
			++l;
			--r;
		}
		return true;
	}
}
