package com.aman.arrays.rotations;

import java.util.Arrays;

import com.aman.arrays.GlobalArrays;

/**
 * https://www.geeksforgeeks.org/count-triplets-with-sum-smaller-that-a-given-value/
 *
 */
public class CountTripletSumLessThanNumber extends GlobalArrays {

	public static void main(String[] args) {
		int arr[] = new int[] { 5, 1, 3, 4, 7 };
		int sum = 12;

		new CountTripletSumLessThanNumber().count(arr);

	}

	private void count(int[] arr) {
		print(arr);
		Arrays.sort(arr);
		print(arr);

		int sum = 0;
		for (int i = 0; i < arr.length - 2; i++) {

			int l = i + 1;
			int r = arr.length - 1;
			
			while (l < r) {
				if (arr[i] + arr[l] + arr[r] < 12) {
					sum = sum + (r - l);
					int tempr = r;
					while(l < tempr) {
						System.out.println(arr[i] + " "+ arr[l] + " "+ arr[tempr]);
						tempr --;
					}
					
				}
				
				
				
				--r;
				++l;
			}

		}
		
		System.out.println("Total : "+sum);
	}

}
