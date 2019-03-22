package com.aman.leetcode.easy.arrays;

public class Code122_BuySellStocks {

	public int maxProfit(int[] arr) {
		int buyPrice = Integer.MAX_VALUE;
		int sellPrice = Integer.MIN_VALUE;
			
		int i=0;		
		int buyIndex = -1;
		int sellIndex = -1;
		int profit = 0;
		
		while (i < arr.length) {
			
			if((arr[i])<= buyPrice) {
				buyPrice = arr[i];
				buyIndex = i;
			}else if(arr[i]>= sellPrice) {
				sellPrice = arr[i];
				sellIndex = i;
				profit = sellPrice - buyPrice;
			}
			
			++i;
		}
		
		if(buyIndex == -1 || sellIndex == -1) {
			return 0;
		}else {
			return sellPrice - buyPrice;
		}
	}

	public static void main(String args[]) {
		System.out.println(new Code122_BuySellStocks().maxProfit(new int[] { 2,4,1 }));
	}
}
