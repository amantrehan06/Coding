package com.aman.leetcode.easy.strings;

public class Code125_ValidPallindrome {

	public boolean isPalindrome(String str) {

		int i = 0;
		int j = str.length() - 1;
		while (i < j) {
			while (i != j && !((str.charAt(i) >= 65 && str.charAt(i) <= 90)
					|| (str.charAt(i) >= 97 && str.charAt(i) <= 122) || (str.charAt(i) >= 48 && str.charAt(i) <= 57))) {
				++i;

			}

			while (i != j && !((str.charAt(j) >= 65 && str.charAt(j) <= 90)
					|| (str.charAt(j) >= 97 && str.charAt(j) <= 122) || (str.charAt(j) >= 48 && str.charAt(j) <= 57))) {
				--j;
			}

			int iAscii = str.charAt(i);
			int jAscii = str.charAt(j);
			
			if(iAscii >=65 && iAscii <=90) {
				iAscii +=32;
			}
			
			if(jAscii >=65 && jAscii <=90) {
				jAscii +=32;
			}

			if (iAscii != jAscii) {
				return false;
			}
			i++;
			j--;

		}
		return true;

	}

	public static void main(String args[]) {

		System.out.println(new Code125_ValidPallindrome().isPalindrome("A man, a plan, a canal: Panama"));
	}
}
