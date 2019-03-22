package com.aman.arrays.strings;

public class CheckIfSubstring_9 {

	public static void main(String args[]) {
		String str1 = "waterbottle";
		String str2 = "erbottlewat";

		System.out.println(new CheckIfSubstring_9().check(str1, str2));
	}

	private boolean check(String str1, String str2) {

		if (str1.length() != str2.length()) {
			return false;
		}

		String concatString = str1 + str1;

		for (int i = 0; i < concatString.length(); i++) {

			int j = 0;
			while ((str2.charAt(j) == concatString.charAt(i))) {
				j++;
				i++;
				if (j == str2.length()) {
					return true;
				}
			}
		}
		return true;
	}
}
