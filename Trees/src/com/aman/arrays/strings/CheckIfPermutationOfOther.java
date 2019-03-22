package com.aman.arrays.strings;

//other solution would be sort the strings and compare 1 by one, it will have NLog(N)
public class CheckIfPermutationOfOther {

	public static void main(String args[]) {

		System.out.println(new CheckIfPermutationOfOther().check("jug", "guj"));
	}

	private boolean check(String str1, String str2) {

		int[] arr = new int[128];

		for (int i = 0; i < str1.length(); i++) {
			int index = str1.charAt(i);
			arr[index]++;
		}

		for (int i = 0; i < str2.length(); i++) {
			int index = str2.charAt(i);
			arr[index]--;
			if (arr[index] < 0) {
				return false;
			}
		}
		
		return true;
	}
}
