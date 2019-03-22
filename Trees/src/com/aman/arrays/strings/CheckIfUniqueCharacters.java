package com.aman.arrays.strings;

public class CheckIfUniqueCharacters {

	public boolean isUnique(String str) {

		if (str.length() > 128) {
			return false;
		}

		boolean[] arr = new boolean[128];

		for (int i = 0; i < str.length(); i++) {
			int ascii = str.charAt(i);

			if (arr[ascii] == true) {
				return false;
			} else {
				arr[ascii] = true;
			}
		}

		return true;
	}

	public static void main(String args[]) {
		String str = "Amadepe";

		System.out.println(new CheckIfUniqueCharacters().isUnique(str));
	}
}
