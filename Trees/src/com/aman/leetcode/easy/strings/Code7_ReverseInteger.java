package com.aman.leetcode.easy.strings;

public class Code7_ReverseInteger {

	public int reverse(int num) {

		boolean isNegativeNumber = false;
		if (num < 0) {
			isNegativeNumber = true;
			num = -num;
		}

		int previous = 0;
		int result = 0;
		while (num != 0) {
			int digit = num % 10;
			result = result * 10 + digit;

			if ((result - digit) / 10 != previous) {
				return 0;
			}
			previous = result;
			num = num / 10;
		}

		if (isNegativeNumber) {
			result = - result;
		}
		return result;

	}

	public static void main(String args[]) {

		int input = -123;
		System.out.println(new Code7_ReverseInteger().reverse(input));
	}
}
