package com.aman.leetcode.medium.backtracking;

import java.util.ArrayList;
import java.util.List;

public class Code46_Permutation {

	public List<List<Integer>> permute(int[] nums) {

		List<List<Integer>> list = new ArrayList<List<Integer>>();

		if (nums.length == 0) {
			return list;
		}

		backtrack(nums, new ArrayList<Integer>(), list);

		return list;

	}

	public void backtrack(int[] nums, List<Integer> tempList, List<List<Integer>> list) {

		if (tempList.size() == nums.length) {
			list.add(new ArrayList<Integer>(tempList));
			return;
		}

		for (int i = 0; i < nums.length; i++) {
			if (tempList.contains(nums[i])) {
				continue;
			}
			tempList.add(nums[i]);
			backtrack(nums, tempList, list);
			tempList.remove(tempList.size() - 1);
		}
	}

	public static void main(String args[]) {
		List<List<Integer>> result = new Code46_Permutation().permute(new int[] { 1, 2, 3 });
		System.out.println(result);

	}

}
