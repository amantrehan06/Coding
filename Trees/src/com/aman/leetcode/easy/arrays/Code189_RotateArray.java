package com.aman.leetcode.easy.arrays;

import com.aman.arrays.GlobalArrays;

public class Code189_RotateArray {

	public void rotateExtraSpace(int[] arr, int k) {

		k = k % arr.length;

		int temp[] = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			int index = (i + k) % arr.length;
			temp[index] = arr[i];
		}

		for (int i = 0; i < arr.length; i++) {
			arr[i] = temp[i];
		}
		// GlobalArrays.print(arr);

	}

	public void rotateReversing(int[] arr, int k) {

		k = k % arr.length;

		reverse(arr, 0, arr.length - 1);
		reverse(arr, 0, k - 1);
		reverse(arr, k, arr.length - 1);

		GlobalArrays.print(arr);

	}

	private int[] reverse(int arr[], int begin, int end) {
		for (int i = begin; i <= end; i++, end--) {

			int temp = arr[i];
			arr[i] = arr[end];
			arr[end] = temp;

		}
		return arr;
	}

	public void rotateCyclic(int[] arr, int k) {

		k = k % arr.length;

		int counts = arr.length;
		for (int i = 0; i < counts; i++) {
			int temp = arr[i];
			int oldIndex = i;
			while (true) {
				int newIndex = (oldIndex + k) % arr.length;
				int buff = arr[newIndex];
				arr[newIndex] = temp;
				temp = buff;

				if (i == newIndex) {
					break;
				}
				oldIndex = newIndex;
				counts--;
			}
			//GlobalArrays.print(arr);
		}
	}

	public static void main(String args[]) {
		// new Code189().rotateExtraSpace(new int[] { 1, 2 }, 3);

		// new Code189().rotateReversing(new int[] { 1, 2 }, 3);

		new Code189_RotateArray().rotateCyclic(new int[] { 1, 2, 3, 4, 5, 6 }, 3);
	}

}
