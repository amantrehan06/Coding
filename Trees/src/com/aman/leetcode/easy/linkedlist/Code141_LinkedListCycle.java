package com.aman.leetcode.easy.linkedlist;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Code141_LinkedListCycle {

	public boolean hasCycle(ListNode head) {

		boolean result = false;
		
		if(head==null || head.next==null) {
			return result;
		}

		ListNode first = head;
		ListNode second = head.next;

		while (second != null && second.next != null) {
			if (first.val == second.val) {
				result = true;
				break;
			}

			first = first.next;
			second = second.next.next;

		}

		return result;

	}

	public static void main(String args[]) {

		ListNode first = new ListNode(1);

		ListNode second = new ListNode(2);

		ListNode third = new ListNode(3);

		ListNode forth = new ListNode(4);

		first.next = second;
		second.next = third;

		third.next = forth;
		forth.next = second;

		// System.out.println(first);

		boolean result = new Code141_LinkedListCycle().hasCycle(first);

		System.out.println(result);

	}

	private void checkMap() {
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "first");
		map.put(2, "second");

		int counter = 0;
		for (Entry<Integer, String> entry : map.entrySet()) {
			System.out.println(entry.getKey());
			++counter;

			if (counter == map.size()) {
				map.put(3, "three");
			}
		}

	}
}
