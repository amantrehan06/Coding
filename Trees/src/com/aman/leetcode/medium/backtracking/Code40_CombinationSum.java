package com.aman.leetcode.medium.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Code40_CombinationSum {

	public List<List<Integer>> combinationSum2(int[] nums, int target) {
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		if (nums.length == 0) {
			return list;
		}

		Arrays.sort(nums);

		backtrack(nums, new ArrayList<Integer>(), list, 0, target);
		return list;
	}

	public void backtrack(int[] nums, List<Integer> tempList, List<List<Integer>> list, int index, int target) {

		int sum = 0;
		for (int i = 0; i < tempList.size(); i++) {
			sum += tempList.get(i);

		}

		if (sum == target) {
			list.add(new ArrayList<Integer>(tempList));
			// System.out.println(tempList);
		}

		for (int i = index; i < nums.length; i++) {
			if (i> index && tempList.contains(nums[i])) {
				continue;
			}
			tempList.add(nums[i]);
			backtrack(nums, tempList, list, i + 1, target);
			tempList.remove(tempList.size() - 1);
		}
	}

	public static void main(String args[]) {
		List<List<Integer>> result = new Code40_CombinationSum().combinationSum2(new int[] { 10, 1, 2, 7, 6, 1, 5 }, 8);
		System.out.println(result);

	}

}
