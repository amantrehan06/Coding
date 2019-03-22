package com.aman.arrays.strings;

import java.util.Arrays;

public class RotateMatrix_7 {

	public static void main(String args[]) {
		int[][] multi = new int[4][];

		int mat[][] = 
	        { 
	            {1, 2, 3, 4}, 
	            {5, 6, 7, 8}, 
	            {9, 10, 11, 12}, 
	            {13, 14, 15, 16} 
	        }; 

		new RotateMatrix_7().rotate(mat);

	}

	private void rotate(int[][] matrix) {

		System.out.println("Matrix length is " + matrix.length);

		int n = matrix.length;

		for (int x = 0; x < n / 2; x++) {
			System.out.println("Executing layer " + x);

			for (int y = x; y < n - x - 1; y++) {
				System.out.println("X: "+x + " and Y: "+y);
				int temp = matrix[x][y];
				matrix[x][y] = matrix[y][n-x-1];
				matrix[y][n-x-1] = matrix[n-x-1][n-y-1];
				matrix[n-x-1][n-y-1] = matrix[n-y-1][x];
				matrix[n-y-1][x] = temp;
			}
		}
		
		for(int i=0; i<matrix.length ; i++) {
			System.out.println(Arrays.toString(matrix[i]));
		}
	}

}
