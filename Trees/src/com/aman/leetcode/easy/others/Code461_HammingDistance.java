package com.aman.leetcode.easy.others;

public class Code461_HammingDistance {

	public int hammingDistance(int x, int y) {

		int distance = 0;
		int xor = x^y;
		
		String binary = Integer.toBinaryString(xor);
		for(int i=0 ; i<binary.length() ; i++) {
			if(binary.charAt(i) == '1') {
				++ distance;
			}
		}
		return distance;
	}

	public static void main(String args[]) {

		int result = new Code461_HammingDistance().hammingDistance(1, 4);

		System.out.println(result);
	}
}
