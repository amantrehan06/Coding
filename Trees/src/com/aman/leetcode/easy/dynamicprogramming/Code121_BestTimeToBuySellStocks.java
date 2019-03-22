package com.aman.leetcode.easy.dynamicprogramming;

public class Code121_BestTimeToBuySellStocks {

	public int maxProfit(int[] arr) {
		int i = 0;
		int profit = 0;
		boolean isBought = false;
		int purchasedPrice = 0;
		while (i < arr.length) {
			if (i < arr.length - 1 && arr[i] < arr[i + 1] && !isBought) {
				isBought = true;
				purchasedPrice = arr[i];
			}

			if ((i == arr.length - 1 || arr[i] > arr[i + 1]) && isBought) {
				isBought = false;
				profit = profit + (arr[i] - purchasedPrice);
				purchasedPrice = 0;
			}
			i++;
		}
		return profit;
	}

	public static void main(String args[]) {
		System.out.println(new Code121_BestTimeToBuySellStocks().maxProfit(new int[] { 1, 2, 3, 4, 5 }));
	}
}
