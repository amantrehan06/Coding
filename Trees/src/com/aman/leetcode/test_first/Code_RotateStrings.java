package com.aman.leetcode.test_first;

public class Code_RotateStrings {

	public boolean rotateString(String a, String b) {

		boolean result = false;

		if (a.equals(b)) {
			return true;
		}

		for (int i = 1; i < a.length(); i++) {
			String rotated = rotate(a, i);
			if (rotated.equals(b)) {
				return true;
			}
		}

		return result;
	}

	public String rotate(String str, int i) {

		str = rotate(str, 0, i-1);
		str = rotate(str, i, str.length()-1);

		String finalString = rotate(str, 0, str.length()-1);
		return finalString;
	}

	public String rotate(String str, int start, int end) {
		StringBuilder builder = new StringBuilder();
		//String tempStr = str.substring(start, end+1);
		char[] arr = str.toCharArray();
		while (start < end) {
			char temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;

			start++;
			end--;

		}

		return String.valueOf(arr);

	}

	public static void main(String args[]) {

		boolean result = new Code_RotateStrings().rotateString("abcde", "cdeab");

		System.out.println(result);
	}
}
