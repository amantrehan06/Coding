package com.aman.leetcode.easy.strings;

/*
 * Approach 1 :- Sort and check one by one nLogn
 * Approach 2 :- Store element of 1st in hashmap and validate second string against hashmap , extra space O(N)
 * 
 */
public class Code242_ValidAnagram {

	public boolean isAnagram(String s, String t) {

		if (s.length() != t.length()) {
			return false;
		}

		int arr[] = new int[26];

		for (int i = 0; i < s.length(); i++) {
			int index = s.charAt(i) - 'a';
			arr[index] = arr[index] + 1;
		}

		for (int i = 0; i < t.length(); i++) {
			int index = t.charAt(i) - 'a';
			arr[index] = arr[index] - 1;
				
			if(arr[index] < 0) {
				return false;
			}	
		}
		return true;
	}

	public static void main(String args[]) {

		System.out.println(new Code242_ValidAnagram().isAnagram("anagram", "nagaram"));
	}
}
