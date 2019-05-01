package com.aman.leetcode.easy.arrays;

public class Code48_Imp2_RotateMatrix {

	public void rotate(int[][] arr) {

		int n = arr.length;
		for (int x = 0; x < n / 2; x++) {

			for (int y = x; y < n - x - 1; y++) {

				int temp = arr[x][y];
				arr[x][y] = arr[n - 1 - y][x];
				arr[n - 1 - y][x] = arr[n - 1 - x][n - 1 - y];
				arr[n - 1 - x][n - 1 - y] = arr[y][n - 1 - x];
				arr[y][n - 1 - x] = temp;
			
			}

		}
	}

	public static void main(String args[]) {


		int mat[][] = {
				
				{ 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 }
				
		};
		new Code48_Imp2_RotateMatrix().rotate(mat);
	}

}
