package com.aman.leetcode.easy.strings;

public class Code38_CountAndSay {

	public String countAndSay(int n) {

		String result = "1";

		if (n == 1) {
			return result;
		}

		for (int x = 2; x <= n; x++) {

			StringBuilder sb = new StringBuilder();
			int i = 0;
			while (i < result.length()) {
				int no = result.charAt(i) - 48;
				int count = 0;
				while (i < result.length() && (result.charAt(i) - 48) == no) {
					++count;
					++i;
				}
				sb.append(count);
				sb.append(no);
			}

			result = sb.toString();
		}

		return result;
	}

	public static void main(String args[]) {

		System.out.println(new Code38_CountAndSay().countAndSay(5));
	}
}
