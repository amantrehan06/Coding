package com.aman.arrays.rotations;

import com.aman.arrays.GlobalArrays;

/**
 * https://www.geeksforgeeks.org/convert-array-into-zig-zag-fashion/ Given an
 * array of DISTINCT elements, rearrange the elements of array in zig-zag
 * fashion in O(n) time. The converted array should be in form a < b > c < d > e
 * < f.
 * 
 * @author ihsgah
 *
 */
public class ZigZagArray extends GlobalArrays {

	// Driver method to test the above function
	public static void main(String[] args) {
		int arr[] = new int[] { 4, 3, 7, 8, 6, 2, 1 };
		new ZigZagArray().convert(arr);
	}

	private void convert(int[] arr) {
		print(arr);

		boolean isLessSign = true;
		for (int i = 0; i < arr.length - 1; i++) {

			boolean shouldSwap = false;
			if (isLessSign) {
				if (!(arr[i] < arr[i + 1])) {
					shouldSwap = true;
				}
				isLessSign = false;
			} else {
				if (!(arr[i] > arr[i + 1])) {
					shouldSwap = true;
				}
				isLessSign = true;
			}

			if (shouldSwap) {
				int temp = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = temp;
			}
		}
		print(arr);

	}
}
