package com.aman.leetcode.medium.arrays;

import java.util.Arrays;

public class Code73_SetMatrixZero {
	public void setZeroes(int[][] matrix) {

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if (matrix[i][j] == 0) {
					matrix[i][j] = -999;
				}
			}
		}


		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if (matrix[i][j] == -999) {
					matrix[i][j] = 0;
					for (int x = 0; x < matrix[0].length; x++) {
						if (matrix[i][x] != -999)
							matrix[i][x] = 0;
					}

					for (int x = 0; x < matrix.length; x++) {
						if (matrix[x][j] != -999)
							matrix[x][j] = 0;
					}

				}
			}
		}

	}

	public static void main(String args[]) {
		// List<List<Integer>> result = new Code15_3Sum().threeSum(new int[] { -1, 0, 1,
		// 2, -1, -4 });

		int mat[][] = {

				{ 0, 1, 2, 0 }, { 3, 4, 5, 2 }, { 1, 3, 1, 5 }

		};

		new Code73_SetMatrixZero().setZeroes(mat);

		for (int i = 0; i < mat.length; i++) {
			System.out.println(Arrays.toString(mat[i]));
		}

	}
}
