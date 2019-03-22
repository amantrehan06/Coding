package com.aman.leetcode.easy.arrays;

import java.util.HashMap;
import java.util.Map;

public class Code1_TwoSum {
	public int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {

			int otherNumber = target - nums[i];

			if (map.containsKey(otherNumber) && map.get(otherNumber) != i) {
				System.out.println(map.get(otherNumber) + " " + i);
				return new int[] { map.get(otherNumber), i };
			}
			map.put(nums[i], i);

		}
		return null;
	}

	public static void main(String args[]) {
		System.out.println(new Code1_TwoSum().twoSum(new int[] { 3, 3 }, 6));
	}

}
