package com.aman.leetcode.easy.arrays;

public class Code26_RemoveDuplicates {

	public int removeDuplicates(int[] arr) {

		int i = 0;
		int j = 1;
		int count = 1;

		while (i < arr.length && j < arr.length) {
			if (arr[i] == arr[j]) {
				j++;
			} else {
				++count;
				arr[i + 1] = arr[j];
				i++;
			}
		}

		for (int x = 0; x < arr.length; x++) {
			System.out.print(arr[x] + " ");
		}

		System.out.println();
		return count;
	}

	public static void main(String args[]) {
		System.out.println(new Code26_RemoveDuplicates().removeDuplicates(new int[] { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 }));
	}

}
