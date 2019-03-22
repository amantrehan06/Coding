package com.aman.leetcode.easy.trees;

import com.aman.leetcode.easy.linkedlist.ListNode;

public class Code109_ConvertSortedLinkedListToBST {

	public TreeNode sortedListToBST(ListNode head) {

		if (head == null) {
			return null;
		}

		ListNode mid = findMid(head);

		TreeNode node = new TreeNode(mid.val);
		
		if(head == mid) {
			return node;
		}
		
		node.left = sortedListToBST(head);
		node.right = sortedListToBST(mid.next);

		return node;
	}

	public ListNode findMid(ListNode head) {

		ListNode slowPointer = head;
		ListNode fastPointer = head;
		ListNode prev = null;

		while (fastPointer != null && fastPointer.next != null) {

			prev = slowPointer;
			slowPointer = slowPointer.next;

			fastPointer = fastPointer.next.next;
		}
		
		if (prev!=null) {
			prev.next = null;
		}else {
			head = null;
		}

		return slowPointer;

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

		TreeNode result = new Code109_ConvertSortedLinkedListToBST().sortedListToBST(first);
		preorder(result);
	}

	public static void preorder(TreeNode result) {
		if (result == null) {
			return;
		}

		System.out.print(result.val);
		preorder(result.left);
		preorder(result.right);

	}
}
