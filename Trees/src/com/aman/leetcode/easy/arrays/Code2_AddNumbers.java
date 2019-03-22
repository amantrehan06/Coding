package com.aman.leetcode.easy.arrays;

//Definition for singly-linked list. 

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}

	@Override
	public String toString() {
		return "ListNode [val=" + val + ", next=" + next + "]";
	}

	

}

class Code2_AddNumbers {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

		ListNode node = null;
		ListNode root = null;
		int remainder = 0;
		while (true) {

			int x = 0;
			int y = 0;
			if (l1 != null) {
				x = l1.val;
				l1 = l1.next;
			}

			if (l2 != null) {
				y = l2.val;
				l2 = l2.next;
			}

			int ans = (x + y + remainder) % 10;
			remainder = (x + y + remainder) / 10;

			if (node == null) {
				node = new ListNode(ans);
				root = node;
			} else {
				ListNode temp = new ListNode(ans);
				node.next = temp;
				node = temp;
			}

			if (l1 == null && l2 == null && remainder == 0) {
				break;
			}
		}

		System.out.println(root);

		return root;
	}

	public static void main(String args[]) {
		ListNode l1 = new ListNode(2);
		l1.next = new ListNode(4);
		l1.next.next = new ListNode(3);

		ListNode l2 = new ListNode(5);
		l2.next = new ListNode(6);
		l2.next.next = new ListNode(4);

		System.out.println(new Code2_AddNumbers().addTwoNumbers(l1, l2));
	}

}
