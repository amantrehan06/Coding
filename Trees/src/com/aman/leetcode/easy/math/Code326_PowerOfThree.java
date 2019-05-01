package com.aman.leetcode.easy.math;

public class Code326_PowerOfThree {

	public boolean isPowerOfThree(int n) {

		if (n < 1) {
			return false;
		}

		while (n % 3 == 0) {
			n = n / 3;
		}

		if (n == 1) {
			return true;
		} else {
			return false;
		}
		
	}

	public static void main(String args[]) {

		try {
			boolean result = new Code326_PowerOfThree().isPowerOfThree(45);

			System.out.println();
			System.out.println("Result is: " + result);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
