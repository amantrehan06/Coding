package com.aman.arrays.strings;

public class URLReplaceSpaceWithPer20 {

	public static void main(String[] args) {
		String str = "Mr John Smith    ";

		new URLReplaceSpaceWithPer20().replace(str.toCharArray(), 13);

	}

	private void replace(char[] arr, int actualLength) {
		int blankSpaces = 0;
		for (int i = 0; i < actualLength; i++) {
			if (arr[i] == ' ') {
				++blankSpaces;
			}
		}

		int j = blankSpaces * 2 + actualLength -1;
		for (int i = actualLength - 1; i >= 0; i--) {
			if (arr[i] != ' ') {
				arr[j] = arr[i];
			} else {
				arr[j] = '0';
				arr[--j] = '2';
				arr[--j] = '%';
			}
			--j;
		}

		System.out.println(arr);
	}

}
