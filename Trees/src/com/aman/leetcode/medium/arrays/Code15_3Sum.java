package com.aman.leetcode.medium.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.aman.arrays.GlobalArrays;

public class Code15_3Sum {

	public List<List<Integer>> threeSum(int[] arr) {

		List<List<Integer>> lists = new ArrayList<>();

		if (arr == null || arr.length == 0) {
			return lists;
		}
		Arrays.sort(arr);
				
		for (int i = 0; i < arr.length; i++) {

			int left = i + 1;
			int right = arr.length - 1;
			int expected = -arr[i];

			if (lists.size() > 0) {
				if (arr[i] == arr[i - 1]) {
					continue;
				}
			}

			while (left < right) {

				int actual = arr[left] + arr[right];

				if (left != 0 && (arr[left] == arr[left - 1]) && arr[left]!=arr[i] ) {
					left++;
				} else if (right != arr.length-1 && (arr[right] == arr[right + 1])) {
					right--;
				} else if (actual == expected) {
					List<Integer> list = new ArrayList<>();
					list.add(arr[i]);
					list.add(arr[left]);
					list.add(arr[right]);
					lists.add(list);
					left++;
					right--;
				} else if (actual > expected) {
					right--;
				} else {
					left++;
				}
			}
		}
		return lists;

	}

	public static void main(String args[]) {
		//List<List<Integer>> result = new Code15_3Sum().threeSum(new int[] { -1, 0, 1, 2, -1, -4 });

		List<List<Integer>> result = new Code15_3Sum().threeSum(new int[] { -2,0,0,2,2 });

		
		System.out.println(result);
	}
}
