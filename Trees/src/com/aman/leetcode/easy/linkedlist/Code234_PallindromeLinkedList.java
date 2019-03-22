package com.aman.leetcode.easy.linkedlist;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Code234_PallindromeLinkedList {

	public boolean isPalindrome(ListNode head) {

		if (head == null || head.next == null) {
			return true;
		}

		ListNode first = head;
		ListNode prev = null;
		ListNode second = head;

		while (second != null && second.next != null) {

			if (second == head) {
				second = head.next;
			} else {
				second = second.next.next;
			}

			ListNode temp = first.next;
			first.next = prev;
			prev = first;
			first = temp;
		}

		if (second == null) {
			second = first;
			first = prev.next;
		} else if (second.next == null) {
			second = first;
			first = prev;
		}

		while (first != null) {
			if (first.val != second.val) {
				return false;
			}
			first = first.next;
			second = second.next;
		}

		return true;
	}

	public static void main(String args[]) {

		ListNode first = new ListNode(1);

		ListNode second = new ListNode(2);

		ListNode third = new ListNode(3);

		 ListNode forth = new ListNode(3);

		ListNode fifth = new ListNode(2);
		ListNode sixth = new ListNode(1);

		first.next = second;
		second.next = third;

		third.next = forth;
		forth.next = fifth;

		// third.next = fifth;
		fifth.next = sixth;

		System.out.println(first);

		boolean result = new Code234_PallindromeLinkedList().isPalindrome(first);

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
