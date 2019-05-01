package com.aman.leetcode.easy.arrays;

public class Code122_BuySellStocks {

	public int maxProfit(int[] arr) {
		int i = 0;
		int maxProfit = 0;
		int minPrice = Integer.MAX_VALUE;
		int minIndex = -1;
		int maxIndex = -1;
		
		while (i < arr.length) {

			if (arr[i] < minPrice) {
				minPrice = arr[i];
				minIndex = i;
			} else if (arr[i] - minPrice > maxProfit) {
				maxProfit = arr[i]- minPrice;
				maxIndex = i;
			}
			++i;
		}
		System.out.println("Min Index: "+minIndex);

		System.out.println("Max Index: "+maxIndex);
		
		return maxProfit;
	}

	public static void main(String args[]) {
		System.out.println(new Code122_BuySellStocks().maxProfit(new int[] { 7, 1, 5, 3, 6, 4 }));
	}
}
