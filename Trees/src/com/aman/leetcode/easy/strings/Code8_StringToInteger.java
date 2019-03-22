package com.aman.leetcode.easy.strings;

public class Code8_StringToInteger {

	public int myAtoi(String str) {

		int x = 0;

		while (x < str.length()
				&& (str.charAt(x) != '-' && str.charAt(x) != '+' && !(str.charAt(x) >= 48 && str.charAt(x) <= 57))) {
			if (str.charAt(x) != ' ') {
				return 0;
			}
			++x;
		}

		boolean isNegativeNum = false;
		if (x < str.length() && str.charAt(x) == '-') {
			isNegativeNum = true;
			++x;
		} else if (x < str.length() && str.charAt(x) == '+') {
			++x;
		}

		int result = 0;

		int previousNum = 0;
		for (int i = x; i < str.length(); i++) {

			if (!(str.charAt(i) >= 48 && str.charAt(i) <= 57)) {
				break;
			}
			result = result * 10 + (str.charAt(i) - 48);

			if (result / 10 != previousNum) {
				if (isNegativeNum) {
					return Integer.MIN_VALUE;
				} else {
					return Integer.MAX_VALUE;
				}
			}
			previousNum = result;
		}

		if (result != 0 && isNegativeNum) {
			result = -result;
		}
		return result;
	}

	public static void main(String args[]) {

		System.out.println(new Code8_StringToInteger().myAtoi("+42"));
	}
}
