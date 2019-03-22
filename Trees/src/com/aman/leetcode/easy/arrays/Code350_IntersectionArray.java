package com.aman.leetcode.easy.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Code350_IntersectionArray {

	public int[] intersect(int[] nums1, int[] nums2) {
		int size1 = nums1.length;
		int size2 = nums2.length;
		Arrays.sort(nums1);
		Arrays.sort(nums2);

		if (size1 > size2) {
			return intersectCon(nums2, nums1);
		} else {
			return intersectCon(nums1, nums2);
		}
	}

	public int[] intersectCon(int[] arr1, int[] arr2) {

		List<Integer> list = new ArrayList<>();

		int i = 0;
		int j = 0;
		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] == arr2[j]) {
				list.add(arr1[i]);
				i++;
				j++;
			} else if (arr1[i] > arr2[j]) {
				j++;
			} else {
				i++;
			}
		}

		int counter = -1;
		int[] finalArr = new int[list.size()];
		for (Integer val : list) {
			finalArr[++counter] = val;
		}

		return finalArr;
	}

	public static void main(String args[]) {
		System.out.println(new Code350_IntersectionArray().intersect(new int[] { 1, 2 }, new int[] { 1, 1 }));
	}
}
