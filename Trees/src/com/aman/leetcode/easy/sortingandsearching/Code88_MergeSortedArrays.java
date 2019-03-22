package com.aman.leetcode.easy.sortingandsearching;

import com.aman.arrays.GlobalArrays;

public class Code88_MergeSortedArrays {

	public void merge(int[] arr1, int m, int[] arr2, int n) {

		int i=0;
		int j = 0;
		while (i<arr1.length && j < arr2.length){
			
			if(arr1[i]<= arr2[j]) {
				i++;
			}
			else {
				//shiftElements(arr1, i, arr2[j]);
				int temp = arr2[j];
				int x = i;
				while(x < arr1.length) {
					
					int buff = arr1[x];
					arr1[x] = temp;
					temp = buff;
					x++;
				}
				
				j++;
				i++;
			}
			
		}
		
		int x = arr2.length;
		while(x>j) {
			arr1[i-1] = arr2[x-1];
			--x;
			--i;
		}
	}

	

	public static void main(String args[]) {

		int arr1[] = new int[] { 1, 2, 3, 0, 0, 0 };
		int arr2[] = new int[] { 2, 5, 6 };

		new Code88_MergeSortedArrays().merge(arr1, 3, arr2, 3);

		GlobalArrays.print(arr1);
	}
}
