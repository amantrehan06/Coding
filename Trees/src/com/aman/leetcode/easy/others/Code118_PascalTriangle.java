package com.aman.leetcode.easy.others;

import java.util.ArrayList;
import java.util.List;

public class Code118_PascalTriangle {

	public List<List<Integer>> generate(int numRows) {

		List<List<Integer>> lists = new ArrayList<>();

		if(numRows==0) {
			return lists;
		}
		
		List<Integer> first = new ArrayList<>();
		first.add(1);
		lists.add(first);
		for (int i = 1; i < numRows; i++) {
			List<Integer> list = new ArrayList<>();
			List<Integer> previousList = lists.get(i - 1);
			list.add(1);
			for (int j = 1; j < i; j++) {
				list.add(previousList.get(j - 1) + previousList.get(j));
			}
			list.add(1);
			lists.add(list);
		}

		return lists;
	}

	public static void main(String args[]) {

		new Code118_PascalTriangle().generate(5);

	}
}
