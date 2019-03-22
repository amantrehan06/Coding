package com.aman.arrays.strings;

import java.util.Arrays;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

public class MarkEntireRowAndColumnZero_8 {

	public static void main(String args[]) {
		int mat[][] = { 
				
				{ 1, 2, 3, 4 }, 
				{ 5, 0, 7, 8 }, 
				{ 9, 10, 11, 0 }, 
				{ 13, 14, 15, 16 } 
			};

		new MarkEntireRowAndColumnZero_8().perform(mat);
	}

	private void perform(int[][] mat) {
		boolean[] rows = new boolean[mat.length];
		boolean[] columns = new boolean[mat[0].length];

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[0].length; j++) {
				if (mat[i][j] == 0) {
					rows[i] = true;
					columns[j] = true;
				}
			}
		}
		
		for (int i=0 ; i<rows.length ; i++) {
			if(rows[i]==true) {
				for(int j=0 ; j< mat[0].length ; j++) {
					mat[i][j]=0;
				}
			}
		}
		
		for (int i=0 ; i<columns.length ; i++) {
			if(columns[i]==true) {
				for(int j=0 ; j< mat.length ; j++) {
					mat[j][i]=0;
				}
			}
		}
		
		for(int i=0;i<mat.length ; i++) {
			System.out.println(Arrays.toString(mat[i]));
		}
		
	}

}
