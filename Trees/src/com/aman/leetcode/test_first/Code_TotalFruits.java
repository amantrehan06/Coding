package com.aman.leetcode.test_first;

public class Code_TotalFruits {

	public int totalFruit(int[] arr) {

		int nums[] = new int[arr.length];
		int weights[] = new int[arr.length];
		int index = 0;
		for (int i = 0; i < arr.length; i++) {

			int count = 1;

			while (i + 1 < arr.length && arr[i + 1] == arr[i]) {
				count++;
				i++;
			}

			nums[index] = arr[i];
			weights[index] = count;
			++ index;
		}

		index = 1;
		int maxWeight = 0;
		
		while (index < nums.length && weights[index] != 0) {
			
			int max =  weights[index-1] + weights[index];
			
			int j = index+1;
			while(j < weights.length && (nums[j] == nums[index] || nums[j] == nums[index-1])) {
				max = max + weights[j];
				j++;
			}
			
			
			if(maxWeight <  max) {
				maxWeight = max;
			}
			++ index;
		}
		
		if(maxWeight == 0) {
			return weights[0];
		}
		

		return maxWeight;

	}

	public static void main(String args[]) {

		int result = new Code_TotalFruits().totalFruit(new int[] { 1,0 });

		System.out.println(result);
	}
}
