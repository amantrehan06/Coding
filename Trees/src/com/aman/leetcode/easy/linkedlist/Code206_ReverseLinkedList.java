package com.aman.leetcode.easy.linkedlist;

public class Code206_ReverseLinkedList {

	public ListNode reverseList(ListNode head) {

		ListNode prev = null;
		ListNode next = head;

		while (next != null) {
			ListNode temp = next.next;
			next.next = prev;
			prev = next;
			next = temp;
		}

		return prev;

	}

	public static void main(String args[]) {
		ListNode first = new ListNode(1);

		ListNode second = new ListNode(2);

		ListNode third = new ListNode(3);

		ListNode forth = new ListNode(4);

		ListNode fifth = new ListNode(5);

		first.next = second;
		second.next = third;
		third.next = forth;
		forth.next = fifth;

		System.out.println(first);

		ListNode head = new Code206_ReverseLinkedList().reverseList(first);

		System.out.println(head);

	}
}
