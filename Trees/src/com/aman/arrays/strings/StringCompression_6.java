package com.aman.arrays.strings;

public class StringCompression_6 {

	public static void main(String args[]) {
		new StringCompression_6().compress("aabcccccaaaf");
	}

	private void compress(String str) {
		StringBuilder builder = new StringBuilder();

		for (int i = 0; i < str.length(); i++) {
			int counter = 1;
			while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
				++i;
				++counter;
			}
			builder.append(str.charAt(i));
			builder.append(counter);
		}
		System.out.println(builder);
	}
}
