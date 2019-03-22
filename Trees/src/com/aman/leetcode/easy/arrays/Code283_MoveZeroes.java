package com.aman.leetcode.easy.arrays;

public class Code283_MoveZeroes {

	public void moveZeroes(int[] arr) {
		int i = 0;
		int j = 1;
		while (i < arr.length && j < arr.length) {
			if (arr[i] == 0 && arr[j] != 0) {
				int temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
				i++;
				j++;
			} else if (arr[i] == 0 && arr[j] == 0) {
				j++;
			}else {
				i++;
				j++;
			}
		}
		System.out.println("End");
	}

	public static void main(String args[]) {
		new Code283_MoveZeroes().moveZeroes(new int[] { 1,0 });
	}
}
