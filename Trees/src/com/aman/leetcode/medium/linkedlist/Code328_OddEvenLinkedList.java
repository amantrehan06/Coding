package com.aman.leetcode.medium.linkedlist;

import com.aman.leetcode.easy.linkedlist.ListNode;

public class Code328_OddEvenLinkedList {

	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

		if (headA == null || headB == null) {
			return null;
		}


		ListNode temp = headA;
		int size1 = calculateSize(temp);

		
		temp = headB;
		int size2 = calculateSize(temp);
		
		if (size1 - size2 > 0) {

			headA = move(headA, size1 - size2);
			
		} else {
			headB = move(headB, size2 - size1);
		}

		while (headA != null) {

			if (headA == headB) {
				return headA;
			}

			headA = headA.next;
			headB = headB.next;
		}

		return null;
	}

	public int calculateSize(ListNode temp) {
		int size = 0;
		while (temp != null) {
			size++;
			temp = temp.next;
		}
		return size;
	}

	public ListNode move(ListNode temp, int counter) {

		while (counter > 0) {
			temp = temp.next;
			--counter;
		}
		
		return temp;
	}

	public static void main(String args[]) {

		ListNode first = new ListNode(1);

		ListNode second = new ListNode(2);

		ListNode third = new ListNode(3);

		ListNode forth = new ListNode(4);

		ListNode fifth = new ListNode(5);
		ListNode sixth = new ListNode(6);

		first.next = second;
		second.next = third;

		third.next = forth;
		forth.next = fifth;

		// third.next = fifth;
		fifth.next = sixth;

		System.out.println(first);

		ListNode tenth = new ListNode(10);
		tenth.next = third;

		ListNode result = new Code328_OddEvenLinkedList().getIntersectionNode(first, tenth);

		// System.out.println(result);

	}

}
