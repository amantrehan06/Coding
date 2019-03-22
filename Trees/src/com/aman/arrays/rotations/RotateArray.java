package com.aman.arrays.rotations;

import com.aman.arrays.GlobalArrays;

import sun.security.util.Length;

public class RotateArray extends GlobalArrays {

	private void rotate(int arr[], int shiftBy) {
		if (arr == null)
			return;

		for (int i = 0; i < shiftBy; i++) {
			rotateByOne(arr);
		}
		
		print(arr);

	}
	
	private void rotateByOne(int arr[]) {
		int temp = arr[0];
		for(int i=0 ; i< arr.length-1; i++) {
			arr[i] = arr[i+1];
		}
		arr[arr.length - 1] = temp;
	}

	public static void main(String args[]) {
		int arr[] = new int[] { 1, 2, 3, 4, 5, 6, 7 };
		new RotateArray().rotate(arr, 2);
	}
}
