package com.aman.leetcode.medium.trees;

public class Code200_NumberOfIslands {

	public int numIslands(char[][] arr) {

		int count = 0;

		if (arr.length == 0) {
			return 0;
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				if (arr[i][j] == '1') {
					markAdjacentToZero(arr, i, j);
					++count;
				}
			}
		}
		return count;
	}

	public void markAdjacentToZero(char[][] arr, int i, int j) {
		if (i < 0 || j < 0 || i >= arr.length || j >= arr[0].length || arr[i][j] != '1') {
			return;
		}
		arr[i][j] = '0';
		markAdjacentToZero(arr, i + 1, j);
		markAdjacentToZero(arr, i - 1, j);
		markAdjacentToZero(arr, i, j + 1);
		markAdjacentToZero(arr, i, j - 1);

	}

	public static void main(String args[]) {

		char mat[][] = {

				{ '1', '1', '0', '0', '0' }, { '1', '1', '0', '0', '0' }, { '0', '0', '1', '0', '0' },
				{ '0', '0', '0', '1', '1' }

		};

		int result = new Code200_NumberOfIslands().numIslands(mat);

		System.out.println(result);
	}
}
