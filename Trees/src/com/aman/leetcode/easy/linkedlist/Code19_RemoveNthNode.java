package com.aman.leetcode.easy.linkedlist;

public class Code19_RemoveNthNode {

	public ListNode removeNthFromEnd(ListNode head, int n) {

		if(n==0) {
			return head;
		}
		
		ListNode first = head;
		ListNode second = head;

		int count = 0;
		while (count < n) {
			second = second.next;
			++count;
		}

		if (second == null) {
			head = head.next;
			return head;
		}

		while (second.next != null) {
			first = first.next;
			second = second.next;
		}

		first.next = first.next.next;

		return head;
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

		ListNode head = new Code19_RemoveNthNode().removeNthFromEnd(first, 0);

		System.out.println(head);

	}
}