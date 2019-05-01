package com.aman.leetcode.medium.sorting;

import com.aman.arrays.GlobalArrays;

public class Code_MergeSort {

	public int[] sortArray(int[] nums) {
		
		if(nums.length == 0 ) {
			return nums;
		}
		merge_sort(nums, 0, nums.length - 1);
		GlobalArrays.print(nums);
		return nums;
	}

	public void merge_sort(int[] arr, int l, int r) {

		if (l < r) {

			int mid = (l + r) / 2;

			merge_sort(arr, l, mid);
			merge_sort(arr, mid + 1, r);
			merge(arr, l, mid, r);

		}

	}

	public void merge(int[] arr, int l, int mid, int r) {

		int[] lArray = new int[mid - l + 1];
		int[] rArray = new int[r - mid];

		int[] finalArr = new int[lArray.length + rArray.length];

		for (int i = 0; i < lArray.length; i++) {
			lArray[i] = arr[l + i];
		}

		for (int i = 0; i < rArray.length; i++) {
			rArray[i] = arr[mid + 1 + i];
		}

		int i = 0;
		int j = 0;

		int k = -1;
		while (i < lArray.length || j < rArray.length) {

			if (i == lArray.length) {
				while (j < rArray.length) {
					finalArr[++k] = rArray[j];
					++j;
				}
				break;
			}

			if (j == rArray.length) {
				while (i < lArray.length) {
					finalArr[++k] = lArray[i];
					++i;
				}
				break;
			}

			if (lArray[i] < rArray[j]) {
				finalArr[++k] = lArray[i];
				i++;
			} else {
				finalArr[++k] = rArray[j];
				j++;
			}

		}

		for (i = 0; i < finalArr.length; i++) {
			arr[l + i] = finalArr[i];
		}

	}

	public static void main(String args[]) {

		new Code_MergeSort().sortArray(new int[] { 1 });
	}
}
