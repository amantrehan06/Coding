package com.aman.leetcode.test_first;

import com.aman.arrays.GlobalArrays;

public class Code_SquareOfArray {

	public int[] sortedSquares(int[] arr) {

		if(arr.length == 0) {
			return arr;
		}
		
		int result[] = new int[arr.length];
		
		int i=0;
		while(arr[i]<0 && i < arr.length-1) {
			++i;
		}
		
		int j = i-1;
		if(i == 0) {
			j = -1;
		}
		
		for(int x = 0 ; x< result.length ; x++) {
			
			if(j==-1) {
				result[x] = arr[i]* arr[i];
				i++;
				continue;
			}
			
			if(j>=0 && i< arr.length && -arr[j] > arr[i]) {
				result[x] = arr[i]* arr[i];
				++i;
			}else {
				result[x] = arr[j]* arr[j];
				--j;
			}
			
			
		}
		
		GlobalArrays.print(result);
		return result;
	}

	public static void main(String args[]) {

		int[] result = new Code_SquareOfArray().sortedSquares(new int[] {-2,0});

		System.out.println(result);
	}
}
