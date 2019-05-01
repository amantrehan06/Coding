package com.aman.leetcode.easy.math;

public class Code204_CountPrimes {

	public int countPrimes(int n) {

		n = n - 1;
		int count = 0;

		boolean arr[] = new boolean[n + 1];

		for (int i = 2; i <= n; i++) {

			if (arr[i] == false) {
				++count;

				int j = 2;
				while (i * j <= n) {
					arr[i * j] = true;
					j++;
				}
			}
		}
		return count;
	}

	public static void main(String args[]) {

		try {
			int result = new Code204_CountPrimes().countPrimes(10);

			System.out.println();
			System.out.println("Result is: " + result);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
