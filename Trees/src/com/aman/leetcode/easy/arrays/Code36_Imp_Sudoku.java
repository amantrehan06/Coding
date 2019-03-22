package com.aman.leetcode.easy.arrays;

import java.util.HashSet;

public class Code36_Imp_Sudoku {

	public boolean isValidSudoku(char[][] arr) {
		for (int i = 0; i < 9; i++) {
			HashSet<Character> rows = new HashSet<>();
			HashSet<Character> cols = new HashSet<>();
			HashSet<Character> grid = new HashSet<>();

			for (int j = 0; j < 9; j++) {

				// Check for rows
				if (arr[i][j] != '.') {
					boolean isInserted = rows.add(arr[i][j]);
					if (!isInserted) {
						return false;
					}
				}

				// Check for columns
				if (arr[j][i] != '.') {
					boolean isInserted = cols.add(arr[j][i]);
					if (!isInserted) {
						return false;
					}
				}

				int rowIndex = 3 * (i / 3);
				int colIndex = 3 * (i % 3);

				int rowIndexVal = rowIndex + (j / 3);
				int colIndexVal = colIndex + (j % 3);

				// Check for grid
				if (arr[rowIndexVal][colIndexVal] != '.') {
					boolean isInserted = grid.add(arr[rowIndexVal][colIndexVal]);
					if (!isInserted) {
						return false;
					}
				}
			}
		}
		return true;
	}
	
	public static void main(String args[]) {

		char [][] input = new char[][] {
			  {'5','3','.','.','7','.','.','.','.'},
			  {'6','.','.','1','9','5','.','.','.'},
			  {'.','9','8','.','.','.','.','6','.'},
			  {'8','.','.','.','6','.','.','.','3'},
			  {'4','.','.','8','.','3','.','.','1'},
			  {'7','.','.','.','2','.','.','.','6'},
			  {'.','6','.','.','.','.','2','8','.'},
			  {'.','.','.','4','1','9','.','.','5'},
			  {'.','.','.','.','8','.','.','7','9'}
		};
		System.out.println(new Code36_Imp_Sudoku().isValidSudoku(input));
	}

}
