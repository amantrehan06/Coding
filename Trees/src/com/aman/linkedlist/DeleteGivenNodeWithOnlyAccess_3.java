package com.aman.linkedlist;

public class DeleteGivenNodeWithOnlyAccess_3 {

	public static void main(String args[]) {

		LinkedListNode head = GlobalLinkedList.createUniqueLinkedList();
		System.out.println("Head " + head);

		LinkedListNode current = head;
		current = current.getNext().getNext();

		System.out.println("Delete node " + current.getId() + " " + current.getName());

		LinkedListNode next = current.getNext();

		while (true) {
			current.setId(next.getId());
			current.setName(next.getName());

			next = next.getNext();

			if (next == null) {
				current.setNext(null);
				break;
			}

			current = current.getNext();
		}

		System.out.println("Head " + head);

	}
}
