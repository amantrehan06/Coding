package com.aman.leetcode.easy.sortingandsearching;

public class Code278_FirstBadVersion {

	public int firstBadVersion(int n) {
		int num = find(1,n);
		return num;
	}

	public int find(long first, long last) {	
		boolean result = false;
		while(first<last) {
			long mid = (first+last)/2;
			//result = isBadVersion((int)mid);
			
			if(result) {
				last = mid;
			}else {
				first = mid+1;
			}	
		}
		return (int) first;
	}



	public static void main(String args[]) {

		new Code278_FirstBadVersion().firstBadVersion(2);

	}
}
