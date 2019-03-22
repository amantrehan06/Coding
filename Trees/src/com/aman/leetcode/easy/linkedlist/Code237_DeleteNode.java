package com.aman.leetcode.easy.linkedlist;

public class Code237_DeleteNode {

	public void deleteNode(ListNode node) {

		ListNode current = node;
		ListNode next = null;
		if (current.next != null) {
			next = current.next;
		}

		while (true) {

			current.val = next.val;

			if (next.next == null) {
				current.next = null;
				break;
			}

			current = next;
			next = next.next;
		}
	}

	public static void main(String args[]) {
		ListNode first = new ListNode(4);

		ListNode second = new ListNode(5);

		ListNode third = new ListNode(1);

		ListNode forth = new ListNode(9);

		first.next = second;
		second.next = third;
		third.next = forth;

		System.out.println(first);

		new Code237_DeleteNode().deleteNode(second);

		System.out.println(first);

	}
}
