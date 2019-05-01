package com.aman.leetcode.test_first;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Code_MajorityElement {

	public List<Integer> majorityElement(int[] nums) {
		Map<Integer, Integer> map = new HashMap<>();
		List<Integer> list = new ArrayList<>();
		
		for(int i=0 ; i< nums.length ; i++) {
			if(map.containsKey(nums[i])) {
				int count = map.get(nums[i]);
				map.put(nums[i], ++ count);
			}else {
				map.put(nums[i], 1);
			}
		}
		
		Set<Integer> set = map.keySet();
		for(Integer entry : set) {
			if(map.get(entry) > nums.length/3) {
				list.add(entry);
			}
		}
		
		return list;
	}

	public static void main(String args[]) {

		List<Integer> result = new Code_MajorityElement().majorityElement(new int[] { 3, 2, 3,2,3,2,2 });

		System.out.println(result);
	}
}
