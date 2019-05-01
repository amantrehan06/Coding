package com.aman.leetcode.easy.arrays;

public class Code169_MajorityElement {

	public int majorityElement(int[] nums) {

		int i = 0;
		int j = 1;

		int count = 1;

		while (i < nums.length && j < nums.length) {

			count = 1;
			if (nums[i] == nums[j]) {
				count++;
			} else if (nums[i] != nums[j] && count > 0) {
				count--;
			} else {
				i = j;
			}

			j++;
		}

		if (count > 0) {

			int counter = 0;
			for (int x = 0; x < nums.length; x++) {
				if (nums[i] == nums[x]) {
					++counter;
				}
			}

			if (counter > nums.length / 2) {
				return nums[i];
			}

		}
		return 0;

	}

	public static void main(String args[]) {
		System.out.println(new Code169_MajorityElement().majorityElement(new int[] { 3, 3, 4 }));
	}
}
