package com.aman.leetcode.easy.math;

public class Code13_RomanToInteger {

	public int romanToInt(String str) {

		if (str == null || str.length() == 0) {
			return 0;
		}

		int number = 0;

		for (int i = str.length() - 1; i >= 0; i--) {
			if (str.charAt(i) == 'I') {
				number += 1;
			} else if (str.charAt(i) == 'V') {
				number += 5;
			} else if (str.charAt(i) == 'X') {
				number += 10;
			} else if (str.charAt(i) == 'L') {
				number += 50;
			} else if (str.charAt(i) == 'C') {
				number += 100;
			} else if (str.charAt(i) == 'D') {
				number += 500;
			} else if (str.charAt(i) == 'M') {
				number += 1000;
			}
		}

		if (str.indexOf("IV") != -1) {
			number -= 2;
		}
		if (str.indexOf("IX") != -1) {
			number -= 2;
		}
		if (str.indexOf("XL") != -1) {
			number -= 20;
		}
		if (str.indexOf("XC") != -1) {
			number -= 20;
		}
		if (str.indexOf("CD") != -1) {
			number -= 200;
		}
		if (str.indexOf("CM") != -1) {
			number -= 200;
		}

		return number;
	}

	public static void main(String args[]) {

		try {
			int result = new Code13_RomanToInteger().romanToInt("III");

			System.out.println();
			System.out.println("Result is: " + result);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
