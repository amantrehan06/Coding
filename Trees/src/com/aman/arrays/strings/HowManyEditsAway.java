package com.aman.arrays.strings;

public class HowManyEditsAway {

	public static void main(String args[]) {
		new HowManyEditsAway().validate("ple", "pale");
	}

	private void validate(String str1, String str2) {
		if (str1.length() == str2.length()) {
			System.out.println(zeroEditAway(str1, str2));
		} else if (str1.length() - 1 == str2.length()) {
			System.out.println(OneRemovalAway(str1, str2));
		} else if (str1.length() == str2.length() - 1) {
			System.out.println(OneInsertAway(str1, str2));
		} else {
			System.out.println("false");
		}

	}

	private boolean OneInsertAway(String str1, String str2) {
		int j = 0;
		int counter = 0;
		for (int i = 0; i < str1.length(); i++) {
			if (str1.charAt(i) != str2.charAt(j)) {
				j++;
				counter++;
				if (str1.charAt(i) != str2.charAt(j) || counter > 1) {
					return false;
				}

			}
			j++;

		}
		return true;
	}

	private boolean OneRemovalAway(String str1, String str2) {
		int j = 0;
		int counter = 0;
		for (int i = 0; i < str2.length(); i++) {
			if (str1.charAt(j) != str2.charAt(i)) {
				j++;
				counter++;
				if (str1.charAt(j) != str2.charAt(i) || counter > 1) {
					return false;
				}

			}
			j++;

		}
		return true;

	}

	private boolean zeroEditAway(String str1, String str2) {

		for (int i = 0; i < str1.length(); i++) {
			if (str1.charAt(i) != str2.charAt(i)) {
				return false;
			}
		}
		return true;
	}
}
