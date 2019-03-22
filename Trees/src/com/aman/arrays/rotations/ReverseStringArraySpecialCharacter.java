package com.aman.arrays.rotations;

/**
 * https://www.geeksforgeeks.org/reverse-an-array-without-affecting-special-characters/
 * @author ihsgah
 *
 */
public class ReverseStringArraySpecialCharacter {

	public static void main(String[] args) {
		String str = "a!!!b.c.d,e'f,ghi";
		char[] charArray = str.toCharArray();

		System.out.println("Input string: " + str);
		reverse(charArray);
		String revStr = new String(charArray);

		System.out.println("Output string: " + revStr);
	}

	private static void reverse(char[] arr) {

		int l = 0;
		int r = arr.length - 1;

		while (l <= r) {
			while (!((arr[l] >= 'a' && arr[l] <= 'z') || (arr[l] >= 'A' && arr[l] <= 'Z'))) {
				l++;
			}

			while (!((arr[r] >= 'a' && arr[r] <= 'z') || (arr[r] >= 'A' && arr[r] <= 'Z'))) {
				r--;
			}

			char temp = arr[l];
			arr[l] = arr[r];
			arr[r] = temp;
			
			++l;
			--r;
		}
	}
}
