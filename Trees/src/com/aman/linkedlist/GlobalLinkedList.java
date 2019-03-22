package com.aman.linkedlist;

public class GlobalLinkedList {
	

	public static LinkedListNode createUniqueLinkedList() {
		LinkedListNode node1 = new LinkedListNode(1, "Amandeep");
		LinkedListNode node2 = new LinkedListNode(2, "Yashpreet");
		LinkedListNode node3 = new LinkedListNode(3, "Supreet");
		LinkedListNode node4 = new LinkedListNode(4, "Avrita");

		node1.setNext(node2);
		node2.setNext(node3);
		node3.setNext(node4);

		return node1;
	}

	public static LinkedListNode createDuplicateElementLinkedList() {
		LinkedListNode node1 = new LinkedListNode(1, "Amandeep");
		LinkedListNode node2 = new LinkedListNode(2, "Yashpreet");
		LinkedListNode node3 = new LinkedListNode(3, "Supreet");

		LinkedListNode node4 = new LinkedListNode(4, "Yashpreet");
		LinkedListNode node5 = new LinkedListNode(5, "Supreet");

		LinkedListNode node6 = new LinkedListNode(6, "Avrita");
		LinkedListNode node7 = new LinkedListNode(7, "Amandeep");

		node1.setNext(node2);
		node2.setNext(node3);
		node3.setNext(node4);
		node4.setNext(node5);
		node5.setNext(node6);
		node6.setNext(node7);

		return node1;
	}

	public static void print(LinkedListNode root) {
		while(root!=null) {
			System.out.println(root);
			root = root.getNext();
		}
	}
}
