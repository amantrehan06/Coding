package com.aman.leetcode.medium.linkedlist;

import com.aman.leetcode.easy.linkedlist.ListNode;

public class Code160_IntersectionLinkedList {

	public ListNode oddEvenList(ListNode head) {

		if (head == null) {
			return null;
		}

		if (head.next == null) {
			return head;
		}

		ListNode first = head;
		ListNode second = head.next;
		ListNode temp = head.next;

		while (second.next != null || first.next != null) {

			first.next = second.next;

			if (second.next != null) {
				first = second.next;
			}

			if (first != null) {
				second.next = first.next;

				if (first.next != null) {
					second = first.next;
				}
			}

		}

		first.next = temp;

		return head;
	}

	public static void main(String args[]) {

		ListNode first = new ListNode(1);

		ListNode second = new ListNode(2);

		ListNode third = new ListNode(3);

		ListNode forth = new ListNode(4);

		ListNode fifth = new ListNode(5);
		//ListNode sixth = new ListNode(6);

		first.next = second;
		second.next = third;

		third.next = forth;
		forth.next = fifth;

		// third.next = fifth;
		//fifth.next = sixth;

		System.out.println(first);

		ListNode result = new Code160_IntersectionLinkedList().oddEvenList(first);

		System.out.println(result);

	}

}
