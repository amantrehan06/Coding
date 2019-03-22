package com.aman.leetcode.easy.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Code349_IntersectionArray {

	public int[] intersection(int[] nums1, int[] nums2) {
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
		
		Set<Integer> list = new HashSet<>();

		for (int i = 0; i < arr1.length; i++) {
			if (Arrays.binarySearch(arr2, arr1[i]) >= 0) {
				list.add(arr1[i]);
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
		System.out.println(new Code349_IntersectionArray().intersection(new int[] { 4,9,5}, new int[] { 9,4,9,8,4}));
	}
}
