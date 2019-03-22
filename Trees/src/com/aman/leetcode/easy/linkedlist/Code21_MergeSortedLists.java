package com.aman.leetcode.easy.linkedlist;

public class Code21_MergeSortedLists {

	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

		if (l1 == null) {
			return l2;
		}

		if (l2 == null) {
			return l1;
		}

		ListNode head = new ListNode(-9999999);
		ListNode current = head;

		while (l1 != null || l2 != null) {

			if(l1==null) {
				while(l2!=null) {
					current.next = l2;
					current = l2;
					l2 = l2.next;
				}
				break;
			}
			
			if(l2==null) {
				while(l1!=null) {
					current.next = l1;
					current = l1;
					l1 = l1.next;
				}
				break;
			}
			
			if (l1.val == l2.val || l1.val < l2.val) {
				current.next = l1;
				current = l1;
				l1 = l1.next;
			} else if (l2.val < l1.val) {
				current.next = l2;
				current = l2;
				l2 = l2.next;
			}
		}

		return head.next;

	}

	public ListNode addNode(ListNode head, ListNode current, ListNode nodeToBeAdded) {
		ListNode temp = new ListNode(nodeToBeAdded.val);

		if (current == null) {
			current = temp;
			head = current;
		} else {
			current.next = temp;
			current = temp;
		}

		return current;
	}

	public static void main(String args[]) {
		ListNode first_1 = new ListNode(1);
		ListNode first_2 = new ListNode(2);
		ListNode first_4 = new ListNode(4);
		first_1.next = first_2;
		first_2.next = first_4;

		ListNode second_1 = new ListNode(1);
		ListNode second_3 = new ListNode(3);
		ListNode second_4 = new ListNode(4);
		second_1.next = second_3;
		second_3.next = second_4;

		System.out.println(first_1);

		System.out.println(second_1);

		ListNode head = new Code21_MergeSortedLists().mergeTwoLists(first_1, second_1);

		System.out.println(head);

	}
}
