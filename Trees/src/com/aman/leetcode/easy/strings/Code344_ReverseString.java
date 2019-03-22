package com.aman.leetcode.easy.strings;

public class Code344_ReverseString {

	public void reverseString(char[] arr) {

		int j = arr.length - 1;
		for (int i = 0; i < j; i++, j--) {
			char temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
		
		System.out.println(arr);
	}

	public static void main(String args[]) {

		char[] input = new char[] { 'h', 'e', 'l', 'l', 'o' };
		new Code344_ReverseString().reverseString(input);
	}
}
