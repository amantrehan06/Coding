package com.aman.arrays.strings;

public class PermutationOfPallindrome {

	public static void main(String args[]) {
//
		new PermutationOfPallindrome().validate("tacctaopapa");
	}

	private void validate(String str) {
		int countOfOdds = 0;
		int[] arr = new int[128];

		for (int i = 0; i < str.length(); i++) {
			System.out.print("Processing " + str.charAt(i));
			int index = str.charAt(i);
			arr[index] = arr[index] + 1;
			System.out.print(" Index Count " + arr[index]);
			if (arr[index] % 2 == 0) {
				--countOfOdds;
			} else {
				++countOfOdds;
			}
			System.out.print(" Counter value: " + countOfOdds);
			System.out.println();
		}

		if (countOfOdds > 1) {
			System.out.println("False");
		} else {
			System.out.println("true");
		}

	}
}
