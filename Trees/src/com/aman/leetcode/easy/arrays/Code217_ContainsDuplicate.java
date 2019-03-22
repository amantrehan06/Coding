package com.aman.leetcode.easy.arrays;

import java.util.HashMap;

public class Code217_ContainsDuplicate {

	public boolean containsDuplicate(int[] nums) {

		HashMap<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(nums[i])) {
				return true;
			}
			map.put(nums[i], nums[i]);
		}
		return false;

	}

	public static void main(String args[]) {
		System.out.println(new Code217_ContainsDuplicate().containsDuplicate(new int[] {1,2,3,4,5,1}));
	}
}
