package com.aman.leetcode.test_first;

import java.util.HashSet;
import java.util.Set;

public class Code_ProductExceptSelf {

	 public int maxProfit(int[] arr) {
	        int maxProfit = 0;
	        
	        if(arr == null || arr.length==0 || arr.length == 1) {
	        	return maxProfit;
	        }
	        
	        int minValue = arr[0];
	        for (int i=1 ; i<arr.length ; i++) {
	        	
	        	if(arr[i] < minValue) {
	        		minValue = arr[i];
	        	}
	        	
	        	if(arr[i] > minValue && (arr[i]-minValue ) > maxProfit) {
	        		maxProfit = arr[i] - minValue;
	        	}
	        }
	        
	        return maxProfit;
	    }

	public static void main(String args[]) {

		int result = new Code_ProductExceptSelf().maxProfit(new int[] { 7,1,5,3,6,4 });
		
		System.out.println(result);
	}
}
