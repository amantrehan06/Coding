package com.aman.leetcode.medium.backtracking;

import java.util.ArrayList;
import java.util.List;

public class Code78_Subsets {

	public List<List<Integer>> subsets(int[] nums) {

		List<List<Integer>> list = new ArrayList<List<Integer>>();
		if (nums.length == 0) {
			return list;
		}
		backtrack(nums, new ArrayList<Integer>(), list, 0);
		return list;

	}

	public void backtrack(int[] nums, List<Integer> tempList, List<List<Integer>> list, int index) {

		
		list.add(new ArrayList<Integer>(tempList));
		System.out.println(tempList);
		
		for (int i = index; i < nums.length; i++) {
			if (tempList.contains(nums[i])) {
				continue;
			}
			tempList.add(nums[i]);
			backtrack(nums, tempList, list, i);
			tempList.remove(tempList.size() - 1);
		}
	}

	public static void main(String args[]) {
		List<List<Integer>> result = new Code78_Subsets().subsets(new int[] { 1, 2, 3 });
		System.out.println(result);

	}

}
